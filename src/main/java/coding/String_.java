package coding;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class String_ {


    @Test
    public void count_the_occurance_after_char(){
        String input="aabcccccaaa";
        Map<Character,Integer> map=new HashMap<>();
        for(char c:input.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            System.out.print( entry.getKey());
            System.out.print( entry.getValue());
        }
    }
    /**
     * Longest substring without repeating characters
     *
     * Input: "abcabcbb" → Output: "abc" or length = 3
     */
    @Test
    public void find_non_repeatative_character_substring(){
        String input="abcdebcbb";
        System.out.println( find_logest_uniqe_string(input));
          String ot="";
        for (int i = 1; i <input.length(); i++) {
            if(input.charAt(0)==input.charAt(i)){
                  ot = input.substring(0,i);
            }
        }
        System.out.println(ot);
    }

    public String find_logest_uniqe_string(String s){
        int left=0;
        int right=0;
        int maxLength=0;
        int startIndex = 0;

        HashSet<Character>set=new HashSet<>();

        while(right<s.length()){
            char current=s.charAt(right);

            while(set.contains(current)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            System.out.println("right "+right);
            System.out.println("left" + left);
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
            right++;
        }




        return s.substring(startIndex, startIndex + maxLength);
    }



    }

