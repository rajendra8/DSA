package com.mobile.appium;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class StringSolutions {

    String str="Hello world , hello world Raj";
   @Test
    public void countOccurance(String str){
       // String str="Hello world , hello world Raj";
        int [] freq=new int[256];

        str= str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch=str.charAt(i);
            if(ch !=' '){
                freq[ch]++;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>1 ){
                System.out.println((char)i +" -----> " +   freq[i] +" times  : ");
            }
        }
    }

  @Test
    public void occurance(String str){

        Map<Character, Integer> map=new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
           map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else {
                map.put(str.charAt(i),0);
            }
        }

        for(Map.Entry<Character,Integer>entry: map.entrySet()){
            System.out.println( entry.getValue());
            System.out.println( entry.getKey());
        }
    }
}
