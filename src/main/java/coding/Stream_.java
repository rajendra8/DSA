package coding;

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


    public static void evenNumber(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers); // Output: [2, 4, 6]

    }

    public static void string_test(){
        List<String> numbers = Arrays.asList("a","c","s","b","d");
       // List<Integer> string = numbers.stream()


    }



    public static void main(String[] args) {
        streamTest();
        evenNumber();
    }
}
