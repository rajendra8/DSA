package com.mobile.appium;

import org.testng.annotations.Test;

public class Number_pattern {

    /**
     *  1
     *  1 2
     *  1 2 3
     *  1 2 3 4
     *  1 2 3 4 5
     */

    @Test
    public void half_parrter_number(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     *  1 2 3 4 5
     *  1 2 3 4
     *  1 2 3
     *  1 2
     *  1
     */

    @Test
    public void inverted_half_pyramid(){

        for (int i = 1; i <=5 ; i++) {
            int num=1;
            for (int j = 5; j >=i ; j--) {
                System.out.print(num);
                num++;
            }
            System.out.println(
            );
        }
    }

    /**
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     *
     */


    @Test
    public void floyd_triangle(){
        int n=0;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(n+1);
                n++;
            }
            System.out.println();
        }
    }

    /**
     * 1            //(1,1)  == (i+j) = 2
     * 0 1          //(2,1) =3,(2,2)=4
     * 1 0 1        // (3,1) (3,2),(3,3)
     * 0 1 0 1     //(4,1)(4,2)(4,3)(4,4)
     * 1 0 1 0 1   //(5,1)(5,2)(5,3)(5,4)(5,5)
     */

    @Test
    public void number_pyramide(){
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    /***
     *        *
     **      **
     ***    ***
     ****  ****
     **********
     **********
     ****  ****
     ***    ***
     **      **
     *        *
    ***/
    @Test
    public void butterFlyPattern(){
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            int space= 2*(n-i);  //6,4,2,0
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            int space= 2*(n-i);   //0,2,4,6
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /***
     *    *****     //i=1 ,space 4   == 5
     *    *****     //i =2 . space =3
     *   *****      //i 3, space =3
     *  *****
     * *****
     */
    @Test
    public void patter_1(){
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /***
     *     1
     *    2 2
     *   3 3 3
     *  4 4 4 4
     * 5 5 5 5 5
     */
    @Test
    public void pattern_2(){
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
