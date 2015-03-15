package creditCardCheck;

import java.util.Scanner;

public class validityTest {
	private static String valid1 = "49927398716";
	private static String valid2 = "49927398717";
	private static String invalid1 = "1234567812345678";
	private static String invalid2 = "1234567812345670";

	public static void main(String[] args) {
		System.out.println(CreditCardCheck.checkCard(valid1));
		System.out.println(CreditCardCheck.checkCard(valid2));
		System.out.println(CreditCardCheck.checkCard(invalid1));
		System.out.println(CreditCardCheck.checkCard(invalid2));
		}
}