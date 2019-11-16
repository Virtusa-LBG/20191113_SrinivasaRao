package assgnment.sri;

import java.util.Scanner;
/**
 * @author srinivas
 *
 */
public class NumbersToWords {


	private static final String ZERO = "zero";
	private static String[] oneToNine = { "one", "two", "three", "four", "five", "six", "seven", "height", "nine" };
	private static String[] tenToNinteen = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen","seventeen", "eighteen", "nineteen" };
	private static String[] dozens = { "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty","ninety" };

	public static void main(String[] args) {
		System.out.println("Enter Number to convert into words :: ");
		try {
			Scanner scanner = new Scanner(System.in);
		
			long number = scanner.nextLong();
			if(number>999999999) {
				System.out.println("Entered number is beyond max limit, try with smaller number.");
			} else {
				System.out.println(convertGivenNumberToWords(number));
			}
			
		}catch (Exception e) {
			System.out.println("Please enter valid number.");
			e.printStackTrace();
		}
	}

	public static String convertGivenNumberToWords(long number) {
		if (number == 0)
			return ZERO;

		return convertNumberToWords(number).trim();
	}

	public static String convertNumberToWords(long number) {
		if (number >= 1000000000) {
			return convertNumberToWords(number / 1000000000) + " billion " + convertNumberToWords(number % 1000000000).trim();
		} else if (number >= 1000000) {
			return convertNumberToWords(number / 1000000) + " million " + convertNumberToWords(number % 1000000).trim();
		} else if (number >= 1000) {
			return convertNumberToWords(number / 1000) + " thousand " + convertNumberToWords(number % 1000).trim();
		} else if (number >= 100) {
			return convertNumberToWords(number / 100) + " hundred " + convertNumberToWords(number % 100).trim();
		}

		int num = (int) number;
		return convert1To99NumbersToWords(num).trim();
	}

	public static String convert1To99NumbersToWords(int number) {
		if (number == 0)
			return "";

		if (number <= 9)
			return oneToNine[number - 1];
		else if (number <= 19)
			return tenToNinteen[number % 10];
		else {
			return dozens[number / 10 - 1] + " " + convert1To99NumbersToWords(number % 10).trim();
		}
	}

}
