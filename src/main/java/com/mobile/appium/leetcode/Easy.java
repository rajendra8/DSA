package com.mobile.appium.leetcode;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Easy {

    /***
     * Problem 1.1: Rotate Array to the Right by K Steps
     * Description: Given an array, rotate the array to the right by k steps. This rotation should be performed in-place.
     *
     * Example:
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     */

    @Test
    public void rotate_1(){
        int[] nums = {1,2,3,4,5,6,7};
        int  k = 3;
        rotate(nums,0,nums.length-1);//7654321
        System.out.println("total reverse");
        rotate(nums,0,2);//5674321
        System.out.println("total reverse");
        rotate(nums,3,nums.length-1);
    }

    public static void rotate(int[] arr, int start,int end){
        while(start<end){
            int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;
        }
        for(int a: arr){
            System.out.print(a);
        }
    }

    /**
     * Input: "aabcccccaaa" → Output: "a2b1c5a3"
     */


}
