import org.testng.annotations.Test;

import java.sql.Array;

public class Qualitest {

    /**
     * FindLongestCommonPrefix
     * Input: [Array: ["flower", "floor", "flow", "flight"]]
     * Output: [String: "fl"]
     * prefix
     */


    @Test
    public void longestMatchingPrefix(){
        String[] array={"flower", "floor", "flow", "flight"};
        String out="";
        String[] arrr;




        for (int i = 0; i < array.length; i++) {

            for (int j = i; j <array[i].length() ; j++) {

                if(array[i].charAt(j)==array[i].charAt(j)){
                    System.out.println(array[i].charAt(j));
                    System.out.println(array[i].charAt(j));
                }
            }
        }
    }
}
