package com.mobile.appium;

import org.testng.annotations.Test;

public class Math {

    //Write a function which takes in 2 numbers and returns the greater of those two.

    public int getGreaterNum(int a,int b){

        if(a>b){
            return a;
        }

        else {
            return b;
        }
    }

    @Test
    public void test(){
       int greater= getGreaterNum(10,31);
        System.out.println(greater);
    }


}
