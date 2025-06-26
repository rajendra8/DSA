import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class WSAudiology {

    int[] arr={4,1,2,1,2,1,2,4,3,5,6,3};


    public void calculateNonRepeatativeNum(int [] input){
        Set<Integer>set=new HashSet<>();
         int repeat=0;
        for(int a:input){
            if (set.contains(a)){
                repeat++;
                if(repeat>=1){
                    set.remove(a);
                    repeat--;
                }

            }else {
                set.add(a);
            }

        }
        System.out.println(set);
    }


    @Test
    public void test(){
      //calculateNonRepeatativeNum(arr);
         int [] freq=new int[arr.length];

         for(int a:arr){
           freq[a]++;
         }
         for (int b:freq){
             if(freq[b]>1){
                 System.out.println(b + " freq "+ freq[b]);
             }
         }


    }
}
