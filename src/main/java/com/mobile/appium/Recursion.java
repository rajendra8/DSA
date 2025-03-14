package com.mobile.appium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Recursion {


    /**
     * power of the number , recursion tree
     * 2^4-------> 2*(2,3)-------->2*2(2,2)---------> 2*2*2(2,1)------->2*2*2*2------> 2^1 = 1 is our base condition
     */

    public static int powerOf(int num,int power){
        if(power==0) return 1;
        if(power==1) return num;
        System.out.println("num  " +num + " power "+ power);
        return num*powerOf(num,power-1);

    }


    /**
     *sum of digit using recursion
     *
     * @param args
     */
    public static int sumOfAllDigit(int num){
        if (num==0) return 0;
        return num % 10 + sumOfAllDigit(num/10);


    }

    /**
     * Fibonnic series
     * 0,1,1,2,3,5,8,13.......
     * @param args
     */

    public static int fibonnicSeries(int num ){
        if (num ==0) return 0;
        if (num==1) return 1;
        return  fibonnicSeries(num-1)+fibonnicSeries(num-2);

    }


    /*
    search any prefix , return should be true if present
       Set discnary
       recursion
     */

    public static boolean wordDicsnary(String str, Set<String> discnary){
          if(str.isEmpty()) return true;
        for (int i = 0; i <=str.length() ; i++) {
            String prefix=str.substring(0,i);
            if(discnary.contains(prefix) && wordDicsnary(str.substring(i),discnary)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
       //int result= powerOf(2,3);
        Set<String> disctionary=new HashSet<String>(Arrays.asList("apple","applepie","pie","le","app"));
        String str="app";
       boolean status= wordDicsnary(str,disctionary);
        System.out.println(status);
        for (int i = 0; i <=5 ; i++) {
            int result= fibonnicSeries(i);
            System.out.println(result);
        }

    }
}
