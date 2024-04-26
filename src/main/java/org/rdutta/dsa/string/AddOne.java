package org.rdutta.dsa.string;

import java.util.Scanner;

public class AddOne {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String N = sc.next();
            StringBuilder result = new StringBuilder();

            // Convert the string to char array
            char[] digits = N.toCharArray();

            // Start from the last digit
            int carry = 1; // Initial carry is 1 since we're adding 1
            for (int i = digits.length - 1; i >= 0; i--) {
                int digit = Character.getNumericValue(digits[i]);
                int sum = digit + carry;

                // Update the digit and carry
                digits[i] = (char) (sum % 10 + '0'); // Update the current digit
                carry = sum / 10; // Update the carry

                // If there's no more carry, break the loop
                if (carry == 0)
                    break;
            }

            // If there's still a carry after processing all digits, prepend it
            if (carry > 0) {
                result.append(carry);
            }

            // Append the remaining digits
            for (char digit : digits) {
                result.append(digit);
            }

            System.out.println(result);
        }
        sc.close();
    }
}
