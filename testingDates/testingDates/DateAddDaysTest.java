package testingDates;
import org.junit.*;
import static org.junit.Assert.*;


public class DateAddDaysTest {
	private static Date theDate = new Date("March", 15, 2025);
	
	@Test
	public void testSameMonth() {
		assertEquals(3, theDate.getMonth());
	}
	
	@Test
	public void testCrossMonth() {
		assert(theDate.getMonth()>3);
	}
	
	@Test
	public void testCrossYear() {
		assert(theDate.getYear()>2025);
	}
}
