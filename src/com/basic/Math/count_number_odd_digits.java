package com.basic.Math;

public class count_number_odd_digits {
	public static int odd_digits(int n) {
		int count = 0;
		if (n == 0) {
			return 0;

		}
		while (n > 0) {
			int digit = n % 10;
			if (digit % 2 != 0) {
				count++;

			}
			n=n/10;

		}

		return count;

	}

	public static void main(String[] args) {
		int result = odd_digits(123);
		System.out.println(result);
	}
}
