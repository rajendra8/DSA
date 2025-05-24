import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class LatestFeature {




    public static void main(String[] args) {
        stream();
        java9();
        List<String>list= Arrays.asList("franz", "ferdinand", "fiel", "vom", "pferd");
        List<String>list1=list.subList(2,4);
        System.out.println( list1.contains(list.get(1)));

        list.stream()
                .filter(name -> name.startsWith("f"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
    public static void java9(){
        List<String>list=List.of("one", "two", "three");
        Set<String>set=Set.of("one", "two", "three");
        Map<String ,String>map=Map.of("foo", "one", "bar", "two");
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }

    public static void stream(){
        Stream<String>stream=Stream.iterate("dasdasdasdasdasadasd",s->s+"s")
                .takeWhile(s -> s.length() < 10);

    }
@Test
    public static void java10(){
        var myname="raj";
        System.out.println(myname);
    }

    @Test
    public static void java11() throws IOException {
        var myname="raj";
        System.out.println(myname);
        myname.isBlank();
        "Mar\nco".lines();
        "Marco  ".strip();

        Path path = Files.writeString(Files.createTempFile("helloworld", ".txt"), "Hi, my name is!");
        String s = Files.readString(path);
        System.out.println(s);
    }



    Runnable runnable =()-> System.out.println("hello world runnable");
}
