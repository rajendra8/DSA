package java8features;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

   @Test
    public void stream(){

       List<Integer> list= Arrays.asList(6,2,32,42,8,22,44,2,10);

       boolean num=list.stream().anyMatch(x->(x&1)==0);
       //boolean num2=list.stream().filter(x->x.si)
       System.out.println(num);
       System.out.println(list.stream().findAny().get());
   }

    @Test(description="while there is filter on  input and expected some output  we can use filter")
    public void stream_filterning(){

        List<String> list= Arrays.asList("Ram","Shyam","Dhan","Meena","Rajendra");

        System.out.println(list.stream().filter(x->x.length()>3).sorted().collect(Collectors.toList()));
    }

    @Test(description="while there is some input and expected some output  we can use map")
    public void stream_Squring(){
        List<Integer> list= Arrays.asList(1,3,5,6,9);
        System.out.println(list.stream().map(x->x*x).sorted().collect(Collectors.toList()));
    }

    @Test(description="while there is some input and expected some output  we can use map")
    public void stream_Sum_of_all(){
        List<Integer> list= Arrays.asList(1,3,5,6,9,212,32);
        System.out.println(list.stream().reduce(Integer::sum));
    }


    @Test(description="while there is some input and expected some output  we can use map")
    public void stream_Char_Occurance(){
        String input="Hello world";
        char [] sequence=input.toCharArray();
        System.out.println( input.chars().filter(x->x=='o').count());

    }

}
