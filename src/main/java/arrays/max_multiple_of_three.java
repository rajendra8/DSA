package arrays;

import org.testng.annotations.Test;

public class max_multiple_of_three {

    //int []ar={12,3,99,13,43,54,52,58,98,63};
    int []ar={-12,-3,-99,-13,-43,-54,-52,-58,-98,-63};

    @Test
    public void maxresultOF_Multiple_3(){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for(int a:ar){
            if(a>first){
                third=second;
                second=first;
                first=a;
            }else if(a>second && a<first){
                third=second;
                second=a;
            } else if (a>third && a<second) {
                third=a;
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(first*second*third);
    }
}
