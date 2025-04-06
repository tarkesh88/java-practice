package com.example.java_practice.problems;


/*
*
* Zinnia
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
*  An input string is valid if: Open brackets must be closed by the same type of brackets.
* Open brackets must be closed in the correct order.
* s = "([)]" → false
* s = "()[]{}" → true
* */
public class ValidParentheses {

    private static boolean isPerfectString(String str) {

        boolean result = true;
        for(int i =0; i<str.length()-2;i++) {
            char ch = str.charAt(i);
            char nextCh = str.charAt(i+1);
            //System.out.println("first char "+ch);
            //System.out.println("second char "+ch);
            //System.out.println("compare "+(String.valueOf(ch).equals("(") && String.valueOf(nextCh).equals(")")));
            if(!(String.valueOf(ch).equals("(") && String.valueOf(nextCh).equals(")"))) {
                result = false;
                break;
            } else if (!(String.valueOf(ch).equals("{") && String.valueOf(nextCh).equals("}"))) {
                result = false;
                break;
            } else if (!(String.valueOf(ch).equals("[") && String.valueOf(nextCh).equals("]"))) {
                result= false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] arg) {

        String str = "([)]";
        String str1 = "(()[[]{{}";
        System.out.println("([)] given string is the perfect combination of char ---> "+isPerfectString(str));
        System.out.println("()[]{} given string is the perfect combination of char ---> "+isPerfectString(str1));
    }
}
