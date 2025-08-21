package Interview;


import com.beust.ah.A;
import org.testng.annotations.Test;

import java.util.*;

/**
 * ount the frequency of each word in a given sentence
 * Input: "Java is easy and Java is popular"
 * Output: {Java=2, is=2, easy=1, and=1, popular=1}
 *
 * input: ["apple", "banana", "apricot", "blueberry", "cherry"]
 * Output: {a=[apple, apricot], b=[banana, blueberry], c=[cherry]}
 */
public class Apexon {

    @Test
    public void count_the_frequnecy(){
        List<String> l = Arrays.asList("apple", "banana", "apricot", "blueberry", "cherry");
        String []input="Java is easy and Java is popular".split(" ");

        Map<Character,List<String>>map=new HashMap<>();
         List<String>output=null;

        for(String s:l){

            map.computeIfAbsent(s.charAt(0),k-> new ArrayList<>()).add(s);
        }
        System.out.println(map);
    }
}
