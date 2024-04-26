package org.rdutta.dsa.string;

import java.util.Scanner;

public class ChefandHappyString {
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();

            int count = 0;

            for (int i = 0; i <s.length()-2; i++) {
                int arg1 = (int) s.charAt(i);
                int arg2 = (int) s.charAt(i + 1);
                // System.out.println(arg1 + "" + arg2);
                if ((arg1 - arg2) != 1) {
                    if (isVowel(s.charAt(i)) && isVowel(s.charAt(i + 1)) && isVowel(s.charAt(i + 2))) {
                        count++;
                    }
                }
            }

            if (count > 0) {
                System.out.println("Happy");
            } else {
                System.out.println("Sad");
            }

        }
    }
}
