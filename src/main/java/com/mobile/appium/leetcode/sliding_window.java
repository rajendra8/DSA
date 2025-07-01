package com.mobile.appium.leetcode;

import org.testng.annotations.Test;

public class sliding_window {

    /***
     * Problem 3.1: Maximum Sum Subarray of Fixed Size K
     * Description: Given an array of integers and an integer k, find the maximum sum of a contiguous subarray of size k.
     *
     * Example:
     * Input: nums = [1, 4, 2, 10, 2, 3, 1, 0, 20], k = 3
     * Output: 21 (from subarray [1, 0, 20])
     */


    @Test
    public void max_sum_of_subarray_of_fixed_size(){
        int []arr={1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k=3;

        if(arr.length<k || k==0){
            System.out.println("false");
        }

        int current_window_sum=0;
        for (int i = 0; i < k; i++) {
            current_window_sum+=arr[i];
            System.out.println(current_window_sum);
        }
       int max_sum= current_window_sum;//7,16,
        for (int i = k; i < arr.length; i++) {
            System.out.println(arr[i]-arr[i-k]);//9,
            current_window_sum+=arr[i]-arr[i-k];//10-1,
            System.out.println(current_window_sum);
            max_sum = Math.max(max_sum, current_window_sum);//Returns the greater of two int values
        }
        System.out.println(max_sum);
    }
}
