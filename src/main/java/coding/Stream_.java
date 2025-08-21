package coding;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_ {



    public static void streamTest(){
        List<String> list = Arrays.asList("a","b","d","e");

        Stream<String> stream=list.stream();

        System.out.printf(stream.toString());
    }




    @Test
    public static void evenNumber(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println( numbers.stream().filter(x->(x&1)==0).collect(Collectors.toList()));
      //  System.out.println(evenNumbers); // Output: [2, 4, 6]

    }

    public static void string_test(){
        List<String> numbers = Arrays.asList("a","c","s","b","d");
        Arrays.stream(new String[]{"a", "b", "c"});
       // List<Integer> string = numbers.stream()


    }
    @Test(description = "we can create stream in 4 ways: from collection, from array, using stream.of, infinite stream")
    public void waysOfCreateStream(){
        List<Integer>list=Arrays.asList(1,2,3,4,2,1,4);
        list.stream();

        String []arr={"q","v","s","e"};
        Arrays.stream(arr);
        Stream<String>stream=Stream.of("a","v","f","d");
        System.out.println("3rd way"+stream);

        Stream<Integer>streamq=Stream.generate( () -> 1).limit(100);
        System.out.println(streamq.toString());


        List<Integer>collection=Stream.iterate(1,x->x+1).limit(100).collect(Collectors.toList());
        System.out.println(collection);

      //  list.stream().filter(x ->x.)

    }



    public static void main(String[] args) {
        streamTest();
        evenNumber();
    }

    @Test
    public void getSalary(){
        int []salary={1000,10000,9000,12000,23000,40000,5000,36000};

       Arrays.stream(salary).filter(s->s>9000).forEach(System.out::println);
    }
}
