package com.mobile.appium;

import org.testng.annotations.Test;

public class Star_pattern {

    /**
     *    ******
     *    ******
     *    ******
     *
     */


    @Test
    public void print_squareStar(){

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    /**
     *   ******      //i=1 (1,1),(1,2)(1,3)
     *   *     *
     *   *     *
     *   *     *
     *   ******    //i=max    (5,1)(5,2)(5,3)
     */
    @Test
    public void hollo_pattern(){
        int outer=5;
        int inner = 6;
        for (int i = 1; i <=outer; i++) {

            for (int j = 1; j <=inner ; j++) {
                if(j ==1 || j== inner || i==1 || i==outer){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     *    *
     *    * *
     *    * * *
     *    * * * *
     *    * * * * *
     *
     */

    @Test
    public void half_pyramid(){
        for (int i = 1; i <=5 ; i++) {   //outer loop
            for (int j = 1; j <=i ; j++) {   // inner loop
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *      * * * * * *
     *      * * * * *
     *      * * * *
     *      * * *
     *      * *
     *      *
     */

    @Test
    public void half_Inverted_pyramid(){
        for (int i = 1; i <=6 ; i++) {   //outer loop
            for (int j = 6; j >= i ; j--) {   // inner loop
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *        *      // space =3, * =1  ==4
     *     *  *      //  space =2, *=2  ==4
     *    * * *      // space =1. *=3   == 4
     *   * * * *      // space =0 , *=4   ==4
     */
  @Test
    public void half_Pyramid(){
      int outer=4;
      for (int i = 1; i <=outer; i++) {
          for (int j = 1; j <=outer-i; j++) {
              System.out.print(" ");
          }
          for (int j = 1; j <=i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
  }
}
