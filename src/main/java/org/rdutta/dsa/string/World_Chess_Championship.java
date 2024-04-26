package org.rdutta.dsa.string;

import java.util.Scanner;

public class World_Chess_Championship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int prizePool = sc.nextInt();
            String S = sc.next();
            int carlsenWinCount = 0;
            int chefWinCount = 0;
            int drawCount = 0;

            for (int round = 0; round < S.length(); round++) {
                char result = S.charAt(round);
                if (result == 'C') {
                    carlsenWinCount++;
                } else if (result == 'D') {
                    drawCount++;
                } else {
                    chefWinCount++;
                }
            }

            int carlsenPoints = 2 * carlsenWinCount + 1 * drawCount + 0 * chefWinCount;
            int chefPoints = 2 * chefWinCount + 1 * drawCount + 0 * carlsenWinCount;

            int carlsenPrizeMoney;
            if (carlsenPoints > chefPoints) {
                carlsenPrizeMoney = 60 * prizePool;
            } else if (chefPoints > carlsenPoints) {
                carlsenPrizeMoney = 40 * prizePool;
            } else {
                carlsenPrizeMoney = 55 * prizePool;
            }

            System.out.println(carlsenPrizeMoney);
        }
    }
}
