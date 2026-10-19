
package com.basic.Math;

public class largest_digit {

    public static int largestDigit(int n) {
        if (n == 0) {
            return 0;
        }

        int largest = 0;

        while (n > 0) {
            int digit = n % 10;
            largest = Math.max(largest, digit);
            n = n / 10;
        }

        return largest;
    }

    public static void main(String[] args) {
        int result = largestDigit(58321);
        System.out.println(result);
    }
}
