package org.rdutta.dsa.string;

import java.util.Scanner;

public class DifferentConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int count = 0;
            int N = scanner.nextInt();
            String S = scanner.next();

            if(N == 1) {
                count = 0;
            }

            for (int j=0; j < N - 1; j++){
                char current = S.charAt(j);
                char next = S.charAt(j + 1);

                if(current == next && current == '1' && next == '1'){
                    S = S.substring(0, j+1) + '0' +S.substring(j+1);
                    count++;
                }else if(current == next && current == '0' && next == '0'){
                    S = S.substring(0, j+1) + '1' +S.substring(j+1);
                    count++;
                }
            }
            System.out.println(count);
        }

        }
}
