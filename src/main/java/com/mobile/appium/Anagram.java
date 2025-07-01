package com.mobile.appium;

import org.testng.annotations.Test;

public class Anagram {

    @Test
    public boolean string_are_anagram(){

        String s="hello";
        String b="olelh";

        int arr[]=new int[26];

        if(s.length()!=b.length()){
            System.out.println("not --- anagram");
            return false;
        }

        for (int i = 0; i < b.length(); i++) {
             arr[s.charAt(i) -'a']++;
             arr[b.charAt(i) - 'a']--;

        }
        for (int a:arr) {
            if(a!=0){
                System.out.println(": not anagram");
                return false;

            }
            return true;
        }
        return false;
    }
}
