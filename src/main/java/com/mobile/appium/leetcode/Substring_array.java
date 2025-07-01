package com.mobile.appium.leetcode;

import org.testng.annotations.Test;

public class Substring_array {

    /***
     * 4. Subarray/Substring Problems
     * Problem 4.1: Print All Substrings of a Given String
     * Description: Given a string, print all its possible contiguous substrings.
     *
     * Example:
     * Input: s = "abc"
     * Output:
     *
     * a
     * b
     * c
     * ab
     * bc
     * abc
     */

    @Test
    public void subarray(){


        String s="hello";

        for (int i = 0; i <s.length() ; i++) {
            System.out.println(i  +  " I ");
            for (int j = i; j <s.length() ; j++) {
                System.out.println(s.substring(i,j+1));
               // System.out.println(s.substring(i,j+1));//0-1,ab,aa
            }
        }
    }

}
/**
 * This uses nested loops to define the start and end of each substring:
 *
 * The outer loop (i) iterates through all possible starting indices (from 0 to n-1).
 * The inner loop (j) iterates through all possible ending indices (from i to n-1).
 * s.substring(i, j + 1) extracts the substring. In Java, substring(beginIndex, endIndex) extracts characters
 * from beginIndex up to, but not including, endIndex. So, j + 1 is used to include the character at index j.
 */