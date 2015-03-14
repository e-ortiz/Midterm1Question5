package creditCardCheck;

import java.util.Scanner;

public class validityTest {
	public static String valid1 = "49927398716";
	public static String valid2 = "49927398717";
	public static String invalid1 = "1234567812345678";
	public static String invalid2 = "1234567812345670";

	public static void main(String[] args) {
		System.out.println(checkCard(valid1));
		System.out.println(checkCard(valid2));
		System.out.println(checkCard(invalid1));
		System.out.println(checkCard(invalid2));
		}
}