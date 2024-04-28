package org.rdutta.dsa.stack.Questions;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/

import java.util.Stack;

/*
s = (){}[]

*/
public class ValidParentheses {


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char foundCharacter : s.toCharArray()) {
            if (foundCharacter == '(' || foundCharacter == '{' || foundCharacter == '[') {
                stack.push(foundCharacter);
            } else if (foundCharacter == ')' || foundCharacter == '}' || foundCharacter == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    char top = stack.pop();
                    if ((foundCharacter == ')' && top != '(') || (foundCharacter == '}' && top != '{')
                            || (foundCharacter == ']' && top != '[')) {
                        return false;
                    }
                }
            }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s = "[}";
        System.out.println(isValid(s)); // Output: true
    }
}