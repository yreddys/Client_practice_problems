package com.basic.Math;

public class count_all_digits_number_brute {
	public static int countDigits(int n) {
		if (n == 0) {
			return 1;

		}
		int count = 0;
		while (n > 0) {
			int digit = n % 10;
			count++;
			n = n / 10;

		}
		return count;

	}

	public static void main(String[] args) {
		int result = countDigits(12);
		System.out.println(result);
	}
}
