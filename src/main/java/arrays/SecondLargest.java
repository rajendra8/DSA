package arrays;

import org.testng.annotations.Test;

public class SecondLargest {

    @Test
    public void find_second_largest(){
        int []arr={12,3,99,13,43,54,52,58,98,63};

        int first=0;
        int second_largest=0;
        int third=0;

        for(int a:arr){
            if(a>first){

                third=second_largest;
                second_largest=first;
                first=a;

            }else if(a>second_largest && a<first ) {
                third=second_largest;
                second_largest=a;

            } else if (a>third && a<second_largest) {
                 third=a;
            }

        }
        System.out.println(first);
        System.out.println(second_largest);
        System.out.println(third);
    }
}
