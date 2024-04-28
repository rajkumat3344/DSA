package org.rdutta.dsa.stack.Questions;

import java.util.Scanner;

public class ValidParenthesesII {

    public static boolean isValid(String s) {
        int top = -1;
        int MAX_SIZE = s.length();

        char[] characterStack = new char[MAX_SIZE];
        for (char getCharacter: s.toCharArray()) {
            //Pushing the characters in stack '(' '{' and '['.
            if(getCharacter == '(' || getCharacter == '{' || getCharacter == '['){
                top = top + 1;
                characterStack[top] = getCharacter;
            }else if(getCharacter == ')' || getCharacter == '}' || getCharacter == ']'){
                if(top == -1) return false;

                //Popping the characters from stack '(' '{' and '['.
                int popOutItem = characterStack[top];
                top = top - 1;

                if((getCharacter == ')' && popOutItem != '(') || (getCharacter == '}' && popOutItem != '{') || (getCharacter == ']' && popOutItem != '[')){
                    return false;
                }
            }
        }


        return top == -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isValid(s));;
    }
}
