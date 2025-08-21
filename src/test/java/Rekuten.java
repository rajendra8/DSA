import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Rekuten {

/**
 * Count Occurrence of Each character:
 * String S: HELLO
 */

@Test
public void test(){
      String inp="HELLO";
    Map<Character,Integer>map=new LinkedHashMap<>();

    for (char c:inp.toCharArray()) {
           map.put(c, map.getOrDefault(c,0)+1);
    }
    for(Map.Entry<Character,Integer>entry:map.entrySet()){
        System.out.println(entry.getKey()+" "+entry.getValue());
    }

}

@Test
public void sumOf(){
    int arr[]={3,1,4,7,6,8,1,9,7};
    int num=15;

    for (int i = 0; i <arr.length ; i++) {
        for (int j = i+1; j <arr.length ; j++) {
            if(arr[i]+arr[j]==num ){
                System.out.println(arr[i] +" "+arr[j]);
            }
        }

    }
}

}
