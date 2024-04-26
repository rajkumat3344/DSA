package org.rdutta.dsa.string;

import java.util.Scanner;

public class BlobbyVolleyScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            StringBuilder result = new StringBuilder();
            char server = 'A';
            char reciever = 'B';
            int rounds = n;
            int pointOfAlice = 0;
            int pointOfBob = 0;
            for(int index = 0; index < rounds; index++){
                if(s.charAt(index) == server){
                    if(server == 'A'){
                        pointOfAlice +=1;
                    }else{
                        pointOfBob+=1;
                    }
                }else if(s.charAt(index) == reciever){
                    if(reciever == 'B'){
                        server = 'B';
                        reciever = 'A';
                    }else{
                        server = 'A';
                        reciever = 'B';
                    }
                }else if(s.charAt(index) != server && s.charAt(index-1) == 'A'){
                    server = 'B';
                    reciever = 'A';
                }
            }

            System.out.println(pointOfAlice+" "+pointOfBob);
        }
    }
}
