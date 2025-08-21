package arrays;

import com.beust.ah.A;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class reverse_array_in_group {

    @Test
    public void test(){
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8};
//3,2,1
        //6,5,4
        //8,7
        // reverse of all index 3
        int k=3;
        int n=arr.length;

        for (int i = 0; i <n ; i+=k) {
            int left=i;
            int right=Math.min(i+k-1,n-1);

            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.stream(arr).count());
        System.out.println(Arrays.stream(arr).min());


        for(int a:arr){
            System.out.print(a);

        }


}


    }
