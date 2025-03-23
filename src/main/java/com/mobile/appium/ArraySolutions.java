package com.mobile.appium;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class ArraySolutions {

    /***
     * Decimal to Binary
     * 23-->10101001
     *
     * Steps:
     * devide with 2 store the reminder at the end reverse the reminders
     */


    public static void convertDecimalToBinary(){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println("Enter the decimal number : ");
       String result="";
        while(number>0){
            int rem=number%2;
            number=number/2;
          //  System.out.print(rem);
            result=rem+result;//perpand the result
        }
        System.out.print(result);


       
    }
// 1. Find the maximum element in an array.

    public void maxNumber(){
       int  input []= {2,21,32,43,23,54,3,87};

        for (int i = 0; i < input.length; i++) {
            if(input==null || input.length==0){
               return;
            }
        }
    }

     public static void main(String[] args) {
        convertDecimalToBinary();
    }
}
