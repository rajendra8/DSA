import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Turvo {

    /**
     * Print the count of the word which contains numbers  :
     *  str1=“vishnu1 vishnu 2vishnu vishnu3 4 vishnu1"
     *  output :
     *
     * vishnu1 -> 2
     * 2vishnu -> 1
     * vishnu3 -> 1
     * 4 -> 1
     */
    @Test
    public void test(){
       String  input="vishnu1 vishnu 2vishnu vishnu3 4 vishnu1";
        findalfaNumericNameWithItsCount(input);

//        Pattern pattern=Pattern.compile("[a-zA-Z0-9]");
//        Matcher matcher1=pattern.matcher(input);
//
//      while(matcher1.find()){
//          System.out.print(matcher1.group() + " " + matcher1.groupCount());
//          System.out.println("");
//      }

    }
public void findalfaNumericNameWithItsCount(String str){
        if(str.isEmpty() || str==null){
            System.out.println("no valid input");
            return;
        }

       // Pattern pattern=Pattern.compile("[\\d+]");
        Pattern pattern=Pattern.compile("\\b\\w+\\b");
        Matcher matcher=pattern.matcher(str);

        Map <String,Integer>map=new HashMap<>();

        while(matcher.find()){
        String result= matcher.group();
            System.out.println(result);

        try{
         // int res=  Integer.parseInt(result);
          map.put(result,map.getOrDefault(result,0)+1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
             //   System.out.println("  Number: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }
}
    /**
     * Patter is a class, compile is an static method to compile regex
     * Matcher is an class ,have many methods to match the text
     *
     */
    @Test
    public void test3(){
        String  input="vishnu1 vishnu 2vishnu vishnu3 4 vishnu1";


        Pattern pattern=Pattern.compile("[0-9][a-z]][0-9]+");
        Matcher matcher1=pattern.matcher(input);
        MatchResult matchResult=matcher1.toMatchResult();
        System.out.println(matchResult.toString());
        while(matcher1.find()){
            System.out.println(matcher1);
            System.out.print( "group count " + matcher1.groupCount());

        }

    }


    /**
     * Finding a repeated index of string 2 in string 1:
     *  Str1= “abcccdccbcc”
     *  Str2=“cc”
     *
     * output
     * 2 , 6 ,9
     */
    @Test
    public void test2(){


        String[] input ="abcccdccbcc".split("");
        String input1 ="abcccdccbcc";
         Pattern pattern=Pattern.compile("[cc]+");
         Matcher matcher=pattern.matcher(input1);
        System.out.println(matcher);
        for (int i = 0; i <input.length-1 ; i++) {
            String a1="";
            for (int j = i; j <= i+1; j++) {
                 a1+=input[j];
                // System.out.println(a1);
                if (a1.equals("cc")){
                 //   System.out.println(i);
                }
            }

        }
    }

}
