package org.rdutta.dsa.string;

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int test = 0; test < t; test++) {
            String S = scanner.next();
            String N = scanner.next();

            int sizeOfString = N.length();

            String guessedString = "";

            for(int index=0; index < sizeOfString; index++){
                char currentChar = S.charAt(index);
                char nextChar = N.charAt(index);

                if(currentChar == nextChar){
                    guessedString += "G";
                }else{
                    guessedString += "B";
                }
            }

            System.out.println(guessedString);
        }
    }
}
