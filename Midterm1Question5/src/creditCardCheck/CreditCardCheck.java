package creditCardCheck;

import java.util.Scanner;

public class CreditCardCheck {

	private static String creditCardNumber;
	
	public static void main(String[] args) {
		Scanner cardScanner = new Scanner(System.in);

		System.out.print("What is your 16-digit credit card number?: ");
		creditCardNumber = cardScanner.nextLine();

		cardScanner.close();

		System.out.println(checkCard(creditCardNumber));

	}

	
	public static boolean luhnTest(String cardNumber) {
		int s1 = 0, s2 = 0;
		String reverse = new StringBuffer(cardNumber).reverse()
				.toString();
		for (int i = 0; i < reverse.length(); i++) {
			int digit = Character.digit(reverse.charAt(i), 10);
			if (i % 2 == 0) {// this is for odd digits, they are 1-indexed in
								// the algorithm
				s1 += digit;
			} else {// add 2 * digit for 0-4, add 2 * digit - 9 for 5-9
				s2 += 2 * digit;
				if (digit >= 5) {
					s2 -= 9;
				}
			}
		}
		return (s1 + s2) % 10 == 0;
	}
	
	
	public static String checkCard(String cardNumber){
		if (luhnTest(cardNumber))
		return "Credit Card is Valid.";
		else
			return "Credit Card is Invalid.";
	
	}

}
