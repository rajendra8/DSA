package coding;

import com.sun.source.tree.ParenthesizedPatternTree;
import org.testng.annotations.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    @Test
    public void findstringFrom_alfaNumeric(){
        String name="rajendra91sa32hu23kum32ar";

        Pattern digitRegex= Pattern.compile("\\d+");
        Matcher digitmatcher=digitRegex.matcher(name);
        int []arr=new int[10];
         int  a=0;
        while(digitmatcher.find()){
             a+=Integer.parseInt(digitmatcher.group());

          //  System.out.print(digitmatcher.group());

        }
        System.out.print(a+"\n");
        System.out.println("------String Regex outcome------");

        Pattern stringPatter=Pattern.compile("[a-zA-Z]+");
        Matcher stringMattcher=stringPatter.matcher(name);

        while(stringMattcher.find()){
            String input=stringMattcher.group();
           // System.out.print(input);
            find_repetitionUsingHashMap(name);
           // find_repeatation(input);
        }
    }

    public void find_repeatation(String s){

        int arr[]=new int[256];

        for (int i = 0; i <s.length() ; i++) {
           arr[s.charAt(i)]++;
        }
        for (int i = 1; i < 256; i++) {
            if(arr[i]>0){
                System.out.println((char)i +"------> times "+arr[i]);
            }
        }
    }

    public void find_repetitionUsingHashMap(String s){
        System.out.print("using hashmap");
        HashMap<Character,Integer>map=new HashMap<>();
        for (Character c:s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+" value --> "+ entry.getValue());
        }
    }


    @Test
    public void tes1(){
        String input="In2d!i2a is m3#y cou5nt$ry".toLowerCase();
    /*
        int []arr=new int[256];

        for (int i = 0; i < input.length(); i++) {
            arr[input.charAt(i)]++;
        }
        for (int i = 1; i <256 ; i++) {
            if(arr[i]>1){
                System.out.println((char)i +"--> " +arr[i]);
            }
        }

        */

        Map<Character,Integer>map=new LinkedHashMap<>();

        for(char c:input.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
       for( Map.Entry<Character,Integer>entry:map.entrySet())
       {
           System.out.print(entry.getKey() +" <-key and count ->"+entry.getValue());
           System.out.println( " ");
        }

        Pattern P=Pattern.compile("\\d+");
        Matcher matcher=P.matcher(input);
        int total=0;
        while(matcher.find()){
            System.out.println( matcher.group());
            System.out.println("match count "+matcher.groupCount());
            total+=Integer.parseInt(matcher.group());

        }
        System.out.println(total);
    }


    @Test
    public void fineNumericValue(){
        String s="rajsmner12mds2mn42m2";
        //Pattern pattern =Pattern.compile("[0-9]+");
       // Pattern pattern =Pattern.compile("[a-zA-Z]+");
        Pattern pattern =Pattern.compile("\\+");
        Matcher matcher=pattern.matcher(s);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
      //  System.out.println(matcher);

    }

}
