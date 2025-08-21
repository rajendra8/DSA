import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {


        //Student score following marks in test.
        //English: 40
        //Maths:42
        //Science: 33
        //Store the value in Map and Find the subject of highest Marks

        Map<String, Integer> map = new HashMap<>();

        map.put("English",40);
        map.put("Maths",42);
        map.put("Science",33);
        int temp=0;
        for( Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()>temp){
                temp=entry.getValue();
              //  System.out.println(entry.getKey());
            }


           // System.out.println(map.entrySet());
          //  String subject=map.get(entry.getKey());
            int marks=entry.getValue();
          //  System.out.println(marks);

           // System.out.print(subject+" "+marks);

        }
        if(temp==map.get(temp)){
            System.out.println(map.entrySet());
        }

    }
}
