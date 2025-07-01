package com.mobile.appium.leetcode;

import org.testng.annotations.Test;

public class Easy1 {



    public static boolean find_2_value_from_array_whose_sum_is(int arr[],int target){

        //int arr[]={2,5,7,11,4};
      //  int target=9;
        int start=0;
        int end=arr.length-1;


        while(start < end){
           int currents_sum= arr[start]+arr[end];
            if(currents_sum==target){
               // System.out.println(currents_sum);
                System.out.println(arr[start]+ ":" + arr[end]);
                return true;
            } else if (currents_sum<target) {
                start++;
            }else{
                end--;
            }

        }
       return true;
    }
    @Test
    public void test(){
        System.out.println("Pair with sum 9 are: " + find_2_value_from_array_whose_sum_is(new int[]{1,2,10,6,8,3,13,1,7,11,15}, 9)); // Output: true
    }
}
