package TopPrograms;

import java.util.Scanner;

public class LeapYearCalculator {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the years");
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " : is a leap year");
		} else {
			System.out.println("Not a leap year");
		}

	}

}
