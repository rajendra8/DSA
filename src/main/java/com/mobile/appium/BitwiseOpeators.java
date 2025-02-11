package com.mobile.appium;

import java.util.BitSet;

public class BitwiseOpeators {

    public static void evenOdd(int num){
       // int number=999;
        if((num&1)==0){
            System.out.println("its even number");
        }else {
            System.out.println("its odd number");
        }
    }


    /***
     * bit wise operator
     * &,|,~,^
     * shift left, shift right
     *    n<<1,       n>>1
     *
     */


    public static void bitwiseOperationTest(){
        int a=4;
        int b=5;
        System.out.print("a&b : ");  // 0100 + 0101= 0100
        System.out.println( a & b);
        System.out.print("a | b : "); // 0100 + 0101= 0101
        System.out.println( a | b);
        System.out.print("a ^ b : ");  //0100 + 0101= 0001
        System.out.println( a ^ b);

        System.out.print("~a : ");
        System.out.println( ~a);
    }


    /**
     * count the 1 from input bit: 00000000000010100010010
     * @param n
     */

    public static int hammingweight(int n){
        int result=0;
        while(n!=0){
            int lastbit= n & 1;
         if(lastbit == 1){
           result++;
         }
         n=n >> 1;
        }
        return result;
    }
    public static void bitwiseOperation(){
        int n=00000000000010100010010;
        int res=hammingweight(n);
        System.out.println(res);
        System.out.println("SR");
        System.out.println(10>>1);//1010>>101
        System.out.println("SL");
        System.out.println(10<<1);  //1010<< 1010+0=10100
    }
    public static void decimalToBinary(){
        int a=15;
        String result="";
        while(a != 0){
            int lastbit=a & 1;
           a= a>>1;
           result=lastbit+result;
        }
        System.out.println(result);
    }

    /**
     * consider binary number as a decimal number
     * % by 10 to get last digit
     * if 1 , then Math,pow(2,index)
     * index++;
     */

    public static void binaryToDecimal(){
       //--> 1010 to 10
        //   8  2
        int n=1111;
        int index=0;
        int result=0;

        while (n > 0){
          int  lastdigit = n%10;//moduler
           if(lastdigit==1){
               result=result + (int)Math.pow(2,index);
           }
            n=n/10;
            System.out.println("n :"+n);
            index++;
        }
        System.out.println(result);

    }

    public static int reverseTheNumber(int num){
       // int num=-45672;
        int result=0;
        //output=321;
        while(num != 0){
            int lastdigit= num % 10;

            if(result < Integer.MIN_VALUE/10 || result > Integer.MAX_VALUE/10){
                //Integer value range { 2^-31 to 2^31 }
                return 0;
            }
            num=num/10;
            result= result*10 + lastdigit;
        }
        return result ;
    }

    /**
     * x= 2^n then true
     * if num is power of 2 then return true,
     * check if num is +ve
     * check num is num>0
     * count  1's in the decimal number using & operator
     * and do RShift >> by 1
     * if num still not 0 then return false
     * 1000=2^3=8
     * 0100=2^2=4
     * 0010=2^1=2  ......only 1 time 1
     * @param x
     */
    public static boolean numIsPowOf2(int x){

        if(x<=0){
            return false;
        }
        while(x !=0){
            int lastbit=x & 1;
            x=x>>1;
            if(lastbit==1 && x != 0){
               return false;
            }
        }
       return true;
    }



public static void complementOfBase10(){
        int num=10;   //0101  --->010, if n=5, if n=10, 1010----->0101 =5
        int mask =0;//00000000000
        int n=num;
        while(num != 0){
          mask=mask<< 1 | 1;     //    0000000 | 1 ==>00000001
          num=num>>1;
        }
    System.out.println( (~n) & mask);
}

    public static boolean isPrimeNumber(int num){

        boolean isPrime=true;
       double sqrt= Math.sqrt(num);
       // System.out.println(sqrt);
      //  for(int i=2;i<num;i++){}  //TC=O(n)
        for (int i = 2; i <=sqrt ; i++) { //TC log(n)
           // System.out.println("i   : "  +i);
            if(num % i==0){
               // System.out.println("num is not prime its divisible by :" + i);
                isPrime=false;
                break;
            }
        }

       return isPrime;
    }



public static void mathFunctions(){
        int num=19;
        int a=10;
        int b=5;
        int result=Math.subtractExact(a,b);
        int result1=Math.multiplyExact(a,b);
    System.out.println(result1);
}

    /**
     * count all prime  number below the input num.
     *
     * @param
     */

    public static boolean countAllPrime(int num){

        int count=0;
       if(num==1){
           return true;
       }
        for (int i = 2; i < num; i++) {
           if(isPrimeNumber(i)){
               count++;
           }
        }
        System.out.println("total prime number : " + count);
        return true;
    }

    /**
     * Factorial n!
     * @param num
     */
    public static void factorialOf(int num){
        long result=1;
        for (int i = num; i > 0; i--) {
             result = result*i;
        }
        System.out.println(result);
    }

    /**
     * Using Recursion fun
     * Factorial
     * fun(n){
     *     fun(n-1)
     * }
     * @param args
     */


    //n= n*(n-1)!
    public static int factorail(int n){
        if (n<=1) return 1;
       // System.out.println("calling recusion fun :" +n);
        return factorail(n-1);
    }


    public static void main(String[] args) {
       decimalToBinary();

      // int num= reverseTheNumber(-0102);

        //evenOdd();
       // bitwiseOperationTest();

        //findNumIsSqurOf2(4);
      // boolean status=numIsPowOf2(-16);
        //System.out.println(" number is power of 2 : "+status);

        //complementOfBase10();
     // boolean isprime=isPrimeNumber(37);
      //  System.out.println("is prime num : "+ isprime);

       // mathFunctions();
     //   countAllPrime(15);
     //  int result= factorail(5);
      //  System.out.println(result);

    }
}
