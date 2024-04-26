package org.rdutta.dsa.string;

import java.util.Scanner;

public class BulbSwitcherII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int presses = 1;

        System.out.println(flipLights(num, presses));
    }

    public static int flipLights(int n, int presses) {
        if (presses == 0 || n == 0) return 1;
        if (n == 1) return 2;
        if (n == 2) return presses == 1 ? 3 : 4;
        if (presses == 1) return 4;
        if (presses == 2) return 7;
        return 8;
    }
}
