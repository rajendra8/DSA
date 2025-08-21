package com.mobile.appium;

import org.testng.annotations.Test;

public class Anagram {

    @Test
    public boolean string_are_anagram() {

        String s = "hello";
        String b = "olelh";

        int arr[] = new int[26];

        if (s.length() != b.length()) {
            System.out.println("not --- anagram");
            return false;
        }

        for (int i = 0; i < b.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[b.charAt(i) - 'a']--;
        }
        for (int a : arr) {
            if (a == 0) {
                System.out.println("anagram");
                  return false;

            } else {
                System.out.println(" not anagram");
                  return true;
            }

        }
        return false;
    }

    /**
     * Group anagrams from an array
     * <p>
     * Input: ["act", "cat", "tac", "dog", "god"] → Output: [["act","cat","tac"], ["dog","god"]]
     */


    @Test
    public void find_the_anagrams_from_array() {
        String[] input = {"act", "cat", "tac", "dog", "god"};
        String[] output=new String[input.length];
        // for(char c:input.);

           int a=0;
        for (int i = 0; i <input.length ; i++) {

            for (int j = i+1; j < input.length; j++) {
              //  System.out.println(input[j]);
               boolean status=  is_anagram(input[i],input[j]);
                System.out.println(status);
               if (status==true)
                   System.out.println(input[i] +" --- "+input[j]);
                 output[a]=input[j];
                a++;

            }
        }
        for(String abc:output){
            System.out.println(abc);
        }

    }

    public boolean is_anagram(String s1, String s2) {
        int arr[] = new int[26];

        if (s1.length() != s2.length()) {
            System.out.println(s1 +"both are not anagram " + s2);
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                //System.out.println("not anagram");
                return false;
            }else {
                return true;
            }

        }
        return false;
    }

    /**
     * Check if string is a rotation of another
     *
     * Input: "waterbottle", "erbottlewat" → Output: true
     */
    @Test
    public void find_Is_rotation_of_eachother(){
       boolean status= is_anagram("waterbottle","erbottlewat");
        System.out.println(status);
    }
}
