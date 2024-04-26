package org.rdutta.dsa.string;

import java.util.Scanner;

public class String_to_Title_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int c= 0; c <= t; c++){
            String S = sc.nextLine();
            StringBuilder resultString = new StringBuilder();

            int start = 0;
            if(S.length() == 1){
                resultString.append(S.charAt(start) - 32);
            }

            while(start < S.length()){
                char store = S.charAt(start);

                if(start == 0 && store >= 'a' && store<='z'){
                    resultString.append((char) (store - 32));
                }else {

                  
                    if (start > 0 && S.charAt(start - 1) == ' ' && store >= 'a' && store <= 'z') {
                        resultString.append((char) (store - 32));
                    } else if (start > 0 && S.charAt(start - 1) == ' ' && store >= 'A' && store <= 'Z') {
                        resultString.append(store);
                    }else{
    
                        if((start!=0 && S.charAt(start-1) != ' ' ) && (S.charAt(start-1) >= 'a' && S.charAt(start-1)<='z') && (S.charAt(start) >= 'A' && S.charAt(start)<='Z')){
                            resultString.append((char) (store + 32));
                        }else{
                            resultString.append(store);
                        }
                    }
                }
                start++;
            }

            System.out.println(resultString);
        }

    }

        }
