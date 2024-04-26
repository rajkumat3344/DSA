package org.rdutta.dsa.string;

import java.util.Scanner;

//Time Complexity:: O(N)
public class DNA_Storage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            // 1 time
            String encodeSequence = "";

            //N times
            for(int index=0; index < s.length(); index+=2){
                char current = s.charAt(index);
                char next = s.charAt(index+1);

                String pair = ""+current+next;
                // 1 time
                switch (pair){
                    case "00":
                        encodeSequence+= "A";
                        break;
                    case "01":
                        encodeSequence+=  "T";
                        break;
                    case "10":
                        encodeSequence+=  "C";
                        break;
                    case "11":
                        encodeSequence+=  "G";
                        break;
                    default:
                        break;
                }
            }

            System.out.println(encodeSequence);
        }
    }
}
