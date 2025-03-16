package testingDates;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DateSetDateTest {
	@Test
	public void testSetDate() {
		Date theDate = new Date("March", 15, 2025);
		assertEquals(new Date("March", 15, 2025), theDate);
	}
}
