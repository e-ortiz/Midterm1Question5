package creditCardCheck;

import static org.junit.Assert.*;
import org.junit.Test;

public class CreditCardCheckTest {

	@Test
	public void testCheckCard() {
		String valid1 = "49927398716";
		String valid2 = "49927398717";
		String invalid1 = "1234567812345678";
		String invalid2 = "1234567812345670";

		assertEquals("Credit Card is Valid.", CreditCardCheck.checkCard(valid1));
		assertEquals("Credit Card is Invalid.", CreditCardCheck.checkCard(valid2));
		assertEquals("Credit Card is Invalid.", CreditCardCheck.checkCard(invalid1));
		assertEquals("Credit Card is Valid.", CreditCardCheck.checkCard(invalid2));
	}


}
