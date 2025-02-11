import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

public class Citius {
    public static void duplicate(String input){
        // Rajendra sahu
        Map<Character,Integer>map=new HashMap<>();

        for(char c: input.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

    }

    public static void main(String[] args) {
        duplicate("Rajendra Sahu");
    }

}
