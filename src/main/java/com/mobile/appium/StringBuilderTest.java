package com.mobile.appium;

import org.testng.annotations.Test;

import java.lang.*;
public class StringBuilderTest {

@Test
    public static void stringSpecial_combination(String str) {
            str="rajendra";

       StringBuilder sb=new StringBuilder(str);
        System.out.println( sb.reverse().toString());
    }
}
