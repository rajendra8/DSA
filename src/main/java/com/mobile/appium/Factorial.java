package com.mobile.appium;

public class Factorial {

    /**
     * use recusrion , a base condition i.e. 5!= 5*4!

     */

  public  static int  factorialOf_(int n ){
         if ( n==1){
             return 1;
         }else{
             return n*factorialOf_(n-1);
         }

    }

    public static void main(String[] args) {
       int num= factorialOf_(3);
        System.out.println(num);
    }

    /**
     * recusion for reverse an sting of
     */

    public String reverseString(String str){

        if(str.equals("")){
            return "" ;
        }else {

        }
        return str;
    }
}
