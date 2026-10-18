
package com.basic.Math;

public class armStrong_Number_brute {

	public static boolean isArmStrongNumber(int number) {

		int original = number;
		int sum = 0;

		while (number > 0) {
			int digit = number % 10;

			sum = sum + digit * digit * digit;

			number = number / 10;
		}

		return sum == original;
	}

	public static void main(String[] args) {
		int number = 153;

		System.out.println(isArmStrongNumber(number));
	}
}
