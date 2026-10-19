
package com.basic.Math;

public class reverse_number {

    public static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        int result = reverse(1234);
        System.out.println(result);
    }
}
