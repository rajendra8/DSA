package com.mobile.appium;

public class SumOfTwo_equalTo_anyOne {
    /**
     * int[] arr = {2, 3, 5, 10, 12}; ---> 2+3=5 , 10/5
     *         int divisor = 5;
     * @return
     */
    public static boolean sumof_2_in_array(int []arr,int devisor ){
        //int[] arr = {2, 3, 5, 10, 12};

        for(int i=0;i<arr.length;i++){

            for (int j = i+1; j <arr.length ; j++) {


                for (int k = j+1; k <arr.length ; k++) {
                    if((arr[i]+arr[j]+arr[k])%devisor==0){
                        return true;
                    }
                }

            }
        }
        return false;

    }
/**
 This code iterates through all pairs of numbers in the array. For each pair, it calculates
 the sum and then checks if any
 other number in the array (excluding the two numbers used for the sum)
 is a non-zero divisor of that sum.
 */


public static boolean checkInarrayIf_sum_of_two_num_is_div_by_any_num(int []arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j <arr.length ; j++) {
            int sum =arr[i]+arr[j];

            for (int k = j+1; k <arr.length ; k++) {
                 if(k !=i && k!=j && arr[k] !=0 && sum % arr[k]==0){
                     System.out.print("arr[i] : "+ arr[i] +" arr[j] : " + arr[j] + "k" +arr[k] +"sum : "+sum);
                     return true;


                 }
            }

        }
    }
    return false;
}





    public static void main(String[] args) {
        int[] arr = { 10, 12,15,13,14,7};
         boolean status=checkInarrayIf_sum_of_two_num_is_div_by_any_num(arr);
                 //sumof_2_in_array(arr,7);
        System.out.println(status);
    }
}
