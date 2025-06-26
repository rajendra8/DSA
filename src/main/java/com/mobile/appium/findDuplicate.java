package com.mobile.appium;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findDuplicate {

    @Test
    public void test(){
        String []input ={"a","c","b","a","c","d","e","f"};
        String name ="Rajendra Kumar Sahu";
        Map<Character,Integer>map=new HashMap<>();
          char [] output=new char[name.length()];
        Set<Character>set=new HashSet<>();
        for (char a: name.toLowerCase().toCharArray()){
            if(!set.add(a)){
                System.out.println(a);
            }
        }
    }
}
