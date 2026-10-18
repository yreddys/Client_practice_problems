package com.basic.Math;

public class countPrimeNumber_brute {
	public static int count_prime_number_n(int n) {
		int count = 0;
		if (n <= 1) {
			return 0;

		}
		for (int num = 2; num <= n; num++) {
			boolean isPrime = true;
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {
				count++;
				
			}

		}
		return count;

	}

	public static void main(String[] args) {
		int n = 2;
		int result = count_prime_number_n(n);
		System.out.println(result);
	}
}
