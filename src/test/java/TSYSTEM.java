import jdk.jfr.Description;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TSYSTEM {


    /**
     * *
     * **
     * ***
     * ****
     * *****
     */

    @Test
    public void test(){

        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public void test1(){
        String input="Tsystem".toLowerCase();
        int []arr=new int[256];

        for (int i = 0; i < input.length(); i++) {
            arr[input.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if(arr[i]>0){
                System.out.println((char)i +"------->"+arr[i]);
            }
        }
    }


    @Test(invocationCount = 1,description = "find the duplicate")
    public void test3(){
        String input="Ram Raja Sarkar Ki Jay".toLowerCase();

        int []arr=new int[256];

        for (int i = 0; i < input.length(); i++) {
            arr[input.charAt(i)]++;
        }
        for (int i = 0; i <256 ; i++) {
           if(arr[i]>0){
               System.out.println((char)i +"--------->"+arr[i]);
           }
        }

    }


    @Test(description = "second highest occurance")
    public void test4(){
        List<Integer> list = Arrays.asList(12,33,34,63,2,3,3,4,3,5,6,5);
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=1;i<list.size();i++){
            if(map.containsKey(list.get(i))){
                map.put(list.get(i), 1);

            }else {
                map.put(list.get(i),0);
            }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+" repeated --->"+ entry.getValue());

        }

    }

}
