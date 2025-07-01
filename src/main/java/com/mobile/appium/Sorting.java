package com.mobile.appium;

import org.testng.annotations.Test;

public class Sorting {

    //Bubble sort
//if arr[i] > arr[i+1] swap them.

    @Test
    public void accending_Order(){
        int [] arr={7,8,1,3,2};

        //outer loop
        for (int i = 0; i<arr.length-1 ; i++) {
            //inner loop
            System.out.println("i : "+i);
            for (int j = 0; j<arr.length-i-1; j++) {
                System.out.println("j : "+j);
                 if(arr[j]>arr[j+1]){
                     int temp =arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
            }
        }
        for(int a:arr){
            System.out.print(a);
        }
    }

    @Test
    public void accending_Order_selection_sorting(){
        int [] arr={7,8,1,3,2};

        //outer loop
        for (int i = 0; i<arr.length ; i++) {
            //inner loop
            int smallest=i;
            System.out.println("i : "+i);
            for (int j = i+1; j<arr.length; j++) {
                System.out.println("j : "+j);
                if(arr[smallest]>arr[j]){
                   smallest=j;
                }
            }
            int temp =arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int a:arr){
            System.out.print(a);
        }
    }

}
