package Interview;

import java.util.Arrays;

public class Rsystem {

   static int input=01010414;

    String s=Integer.toString(01010414);

   public static int reverseTheNumber(int in){

         int lastdigit=0;
         int temp=0;
         int reversd=0;
         int i=0;
         String result=null;
       if(in < Integer.MAX_VALUE) {
           while (in != 0) {
               lastdigit = in % 10;
               in = in / 10;
              reversd = reversd*10+lastdigit;
           }
       }else {
           System.out.println("input is more out of range of Int");
       }

      // System.out.println(reversd);
         return reversd;
   }

   public static void pyramidOfStar(){

       for (int i = 1; i < 10; i++) {
           for (int j = 1; j <= i; j++) {//
               System.out.print("*");
           }
           System.out.print("\n");
       }
   }

   public static String  reverseString(){
       String input="01010414";
        String[] s=input.split("");
                //"Rajendra".split("");
        String out = "";
       for (int i = s.length-1; i>=0; i--) {
           out= out +  s[i];
       }
         return out;
   }

   public static void ascendingOrder(){

       int[] digitArray = {3, 1, 4, 1, 5, 9};
       int  n=digitArray.length;
       for (int i = 0; i <5 ; i++) {
           for (int j = 0; j < n-1-i; j++) {
               // System.out.println("i : " +i + " j :" +j);
               if (digitArray[j] > digitArray[j + 1]) {
                   // Swap digits[j] and digits[j+1]
                   System.out.println("digitArray[j] : " +digitArray[j] + " digitArray[j+1] :" +digitArray[j+1]);
                   int temp = digitArray[j];
                   digitArray[j] = digitArray[j + 1];
                   digitArray[j + 1] = temp;
               }

           }
       }
       System.out.println(Arrays.toString(digitArray));
   }





    public static void main(String[] args) {
       String s= reverseString();
        System.out.println(s);
    }
}

/***
 * *
 * **
 * ***
 * ****
 */
