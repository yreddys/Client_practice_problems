package com.basic.Math;

public class perfect_Number_brute {

	public static boolean isPerfect_Number(int number) {

		// Numbers less than or equal to 1 are not perfect
		if (number <= 1) {
			return false;
		}

		int sum = 0;

		// Find proper divisors
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}

		// Compare the sum with the original number
		return number == sum;
	}

	public static void main(String[] args) {
		int number = 16;

		boolean result = isPerfect_Number(number);

		System.out.println(result);
	}
}