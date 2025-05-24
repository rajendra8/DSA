package latest_feature_java;

import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

    @Test
    public void findEvenNumber(){
        List<Integer>list =List.of(12,21,43,54,32,53,32,65);
        List<Integer>output=list.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(output);

    }


    @Test
    public void findmaxValueFromList(){
        List<Integer>list=List.of(21,3,4,54,53,65,73,92,34,2,34,45);
       int maxNub= list.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        System.out.println(maxNub);

    }
    public int test(int x,int y){
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    @Test
    public void test_(){
        int output=0;
        List<Integer>list=List.of(21,3,4,54,53,65,73,92,34,2,34,45);
        for (int i=0;i<list.size();i++){
            for (int j=0;j<list.size();j++){
               output =test(list.indexOf(i),list.indexOf(j));
                System.out.println(list.indexOf(i));
            }
            System.out.println(output);
        }

    // int output=   test(10,12);
  //      System.out.println(output);
    }
}
