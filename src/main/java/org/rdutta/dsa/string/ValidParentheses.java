package org.rdutta.dsa.string;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/

/*
s = (){}[]

1>Open brackets must be closed by the same type of brackets.
--> let's foundCharacter is s.charAt(firstElement) which is either (, { or [ etc.
--> than check that the next charAt(secondElement) which is either ), } or ] etc.
--> if the above than return true and check for next by incrementing firstElement by 2 and secondElement by 2
-->else return false
*/
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "({[]})";

        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        boolean validity = false;



        return validity;
    }
}
