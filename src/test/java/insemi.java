import org.testng.annotations.Test;
import java.util.*;
/**
 * //strs = ["flower","flow","flight"]
 *          //Output: "fl
 */
public class insemi {
    //first round
    @Test
    public void max_consecutive(){
        String []input ={"flower","flow","flight"};

        for (int i = 0; i <input.length ; i++) {

            for (int j = 0; j <input[i].length() ; j++) {
                if(input[i].substring(j)==input[i]){
                    System.out.println(input[j]);
                }
            }
        }
    }

    @Test
    //Second round
       public  void main() {
            int [] arr={5, 7, 9, 2, 4, 1, 4, 7, 12, 20, 11, 3, 5};
            //Give me numbers which exist more than once

            Map<Integer,Integer>map=new HashMap<>();

            for(int a:arr){
                map.put(a,map.getOrDefault(a,0)+1);
            }
            for(Map.Entry<Integer,Integer> entry :map.entrySet()){
                if(entry.getValue()>1){
                    System.out.println(entry.getKey());
                }

            }
            //System.out.println(map);
        }

}
