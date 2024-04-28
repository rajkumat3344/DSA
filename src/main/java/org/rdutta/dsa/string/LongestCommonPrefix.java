package org.rdutta.dsa.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";

        if (strs == null || strs.length == 0)
        {
            return "";
        }

        if (strs.length == 1)
        {
            return strs[0];
        }

        int subIndex = 0;

        while (subIndex < strs[0].length()) {
            char target = strs[0].charAt(subIndex);

            for (int mainIndex = 1; mainIndex < strs.length; mainIndex++) {

                if (subIndex >= strs[mainIndex].length() || strs[mainIndex].charAt(subIndex) != target) {
                    return result;
                }
            }
            result += target;
            subIndex++;
        }

        return result;
    }
}
