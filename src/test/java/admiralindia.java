import java.util.*;
public class admiralindia {
    //dupliate from the list

   static int array []={2,12,11,32,2,10,100,12,34,3,43,34};
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();

        for(int a: array){
            if(set.contains(a)){
                System.out.println(a);
            }
            else {
                set.add(a);
            }

        }
    }
}
