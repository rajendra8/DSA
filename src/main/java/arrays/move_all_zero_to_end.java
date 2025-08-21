package arrays;

import org.testng.annotations.Test;

public class move_all_zero_to_end {

    int  arr[] = {0, 1, 0, 1, 2, 3, 0,1,4,2,0,5,0,3};

    @Test
    public void test(){
       int length=arr.length;
       int []newArr=new int[length];
           int j=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]!=0){
               newArr[j++]=arr[i];
            }

        }
        while(length>j){
            newArr[j++]=0;
        }
        for (int i = 0; i <length ; i++) {
            arr[i]=newArr[i];
            System.out.print(  arr[i]);
        }

        }
    }




