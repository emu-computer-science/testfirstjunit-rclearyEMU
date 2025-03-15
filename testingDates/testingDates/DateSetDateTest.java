package testingDates;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DateSetDateTest {
	@Test
	public void testSetDate() {
		Date theDate = new Date();
		theDate.setDate(3, 15, 2025);
		assertEquals(theDate.equals(new Date(3, 15, 2025)), theDate);
	}
}
