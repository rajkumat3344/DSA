package org.rdutta.dsa.string;

import java.util.Scanner;

public class NButtons1Bulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(bulbSwitch(num));

    }

    public static int bulbSwitch(int n) {
        return (int)(Math.sqrt(n));
    }
}
