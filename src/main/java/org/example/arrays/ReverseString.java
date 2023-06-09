package org.example.arrays;

import java.util.*;

public class ReverseString {

    public static void main(String[] args) {

        String x = "Haroon";

        System.out.println(reverseStringBruteForce(x));
        System.out.println(reversStringReverseMethod(x));

    }

    static StringBuffer reverseStringBruteForce(String string) {
        StringBuffer sb = new StringBuffer();
        for (int i = string.length() -1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return sb;
    }

    static String reversStringReverseMethod(String string) {

        //ArrayList<Character> ss = string.split(" ");
        //char[] charArray = string.toCharArray();
        String[] strSplit = string.split("");

        // Now convert string into ArrayList --- Arraylist of characters
        ArrayList<String> strList = new ArrayList<>(
                Arrays.asList(strSplit));

        Collections.reverse(strList);

        String reversedStringUsingToString = strList.toString();
        String reversedStringJoin = String.join("", strList);

        System.out.println(reversedStringUsingToString);
        System.out.println(reversedStringJoin);

        return reversedStringJoin;
    }
}
