package arrays;

import org.testng.annotations.Test;

import java.util.Arrays;

public class max_consecutive {


    @Test
    public void most_consecutive(){
       int  arr[] = {0, 1, 0, 1, 1, 1, 1};
        int counter=0; int max_count=1;

        for(int i=1;i<arr.length;i++){
           if(arr[i]==arr[i-1]){
               max_count++;
           }else {
              Math.max(counter,max_count);
              counter=1;
           }

       }
        System.out.println(max_count);
        System.out.println( Math.max(counter,max_count));

    }

   // ["flower","flow","flight"]
    // Output: "fl

    @Test
    public void prefix_from_array(){

        String []arr={"flower","flow","flight"};
        String prefix=arr[0];
        for (int i = 1; i < arr.length; i++) {


                while(arr[i].indexOf(prefix)!=0){
                    prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println(prefix);
    }

}
