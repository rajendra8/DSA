package arrays;

import jdk.jfr.Description;
import org.testng.annotations.Test;

import java.util.Arrays;

public class rotate_an_array_by_value {

    int[] arr={1, 2, 3, 4, 5, 6};

    //output={3, 4, 5, 6, 1, 2}
    int rotateby=2;

    @Test()
    public void test(){
     int n= arr.length;
     //outer loop
        for (int i = 0; i <2 ; i++) {
            //inner loop
            int temp =arr[0];
            for (int j = 0; j < n-1; j++) {

                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
        for(int a:arr){
            System.out.print(a);
        }

    }

    @Test
    public void seconde_approach(){
        int []temp=new int[arr.length];

           int counter=0;
        for (int i = 2; i < arr.length; i++) {
             temp[counter]=arr[i];
             counter++;

        }
        for (int i = 0; i < 2; i++) {
            temp[arr.length-1-i]=arr[i];
        }
      //  temp[arr.length-1]=tempValue;
     //   temp[arr.length-2]=tempValue_2;

        for(int a:temp){
          //  arr[counter]=a;

            System.out.print(a);
        }
    }


}
