package com.mobile.appium;

import java.util.Arrays;

public class DIgitArray {
    static int [] digit={1, 2, 3, 4, 5};

    public static void main(String[] args) {
       //seprateEvenOdd(digit);
        diffOfLargestAndSmallest();
       String a= result();
        System.out.println(a);
    }
    public static void seprateEvenOdd(int [] digit){
         int [] even=new int[digit.length];
         int evencount=0;
         int []odd=new int[digit.length];
         int oddcount=0;

        for (int a:digit) {
            if((a & 1) ==0){
                even[evencount]=a;
              //  System.out.println("even :" + even[evencount]);
                evencount++;
            }else {

                odd[oddcount]=a;
                System.out.println("odd " + odd[oddcount]);
                oddcount++;
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
    }


    public static void diffOfLargestAndSmallest(){
        int  [] digit ={4, 7, 2, 8};
        int small=0;
        int large=0;
        for (int a:digit) {
            if(a>large) {
                large=a;
            } else  {//2<4
                small=a;
            }
        }


        int diff= (large-small);
        System.out.println("large and  small diff : " +large   +" - "+small+ " :" + diff);
    }


    public static String result(){
        String apn=null;
          apn="ABC";
        System.out.println(apn.length());
        return apn;
    }

}
