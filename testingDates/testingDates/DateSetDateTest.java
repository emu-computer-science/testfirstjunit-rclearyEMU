package testingDates;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DateSetDateTest {
	@Test
	public void testSetDate() {
		Date theDate = new Date("March", 15, 2025);
		assertTrue(theDate.equals(new Date("March", 15, 2025)));
	}
}
