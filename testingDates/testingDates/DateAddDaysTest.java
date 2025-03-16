package testingDates;
import org.junit.*;
import static org.junit.Assert.*;


public class DateAddDaysTest {
	
	@Test
	public void testSameMonth() {
		Date theDate = new Date("March", 15, 2025);
		assertEquals(3, theDate.getMonth());
	}
	
	@Test
	public void testCrossMonth() {
		Date theDate = new Date("March", 31, 2025);
		Date newDate = new Date(theDate.addOneDay());
		assertEquals(4, newDate.getMonth());
	}
	
	@Test
	public void testCrossYear() {
		Date theDate = new Date("December", 31, 2025);
		Date newDate = new Date(theDate.addOneDay());
		assertEquals(2026, newDate.getYear());
	}
}
