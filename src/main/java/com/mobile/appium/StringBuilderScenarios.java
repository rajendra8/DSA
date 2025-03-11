package com.mobile.appium;

public class StringBuilderScenarios {

    /**
     * Stringchange  wheneverA capital M encounter,
     * duplicate the previous character, then remove the M. And
     * whenever a capital N is encountered, remove the next character from the string.
     * Then remove the N. All other
     * character in the string will be lowercase , write code in java.
     * input ="heMNloWoMrld"
     * output=helloWorld
     */


    public static String outcome(String str){
         StringBuilder sb=new StringBuilder();
         int i=0;
         while(! str.isEmpty()){
             if(str.charAt(i)=='M') {
                 // sb.append(sb.deleteCharAt(i),sb.insert(i,str.charAt(i-1)))
                 str.replace(str.charAt(i),str.charAt(i-1));
                 sb.deleteCharAt(str.charAt(i));
                 sb.append(sb.insert(i,str.charAt(i-1)));
             } else if (str.charAt(i)=='N') {
                 sb.append(sb.deleteCharAt(i+1));
                 sb.append(sb.deleteCharAt(i));
             }else {
                 sb.append(str.charAt(i));

             }
             i++;
         }
         return sb.toString();

    }

    public static void main(String[] args) {
        String result=outcome("heMNloWoMrld");
    }
}
