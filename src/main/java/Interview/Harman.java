package Interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class Harman {

    public static void main(String[] args) {
        int [] input={5,4,4,3};
        orderTest();
       boolean st= sizeOfArray(input);
        System.out.println(st);
    }

    public static void orderTest(){
        //[5,4,4,3]  [5,4,3]
          int [] input={5,4,4,3};
        Set<Integer>set=new LinkedHashSet<>();

       for(int output:input){
           set.add(output);
       }
        System.out.println(set);
    }

    public static boolean sizeOfArray(int []input){
        if(input.length<0 && input==null){
            return false;
        }
        return true;
    }

    public static boolean checkOutput(int []input,int []output){

        if(input.length<output.length){
            return false;
        }
        return true;

    }
    public static void inSequence(int []input){
        int []output=new int[input.length];
        for (int i = 0; i < input.length; i++) {

        }
    }

    //BDD red green cycle
    //put fetch
    //design pattern
    //BDD principal
    //\




}
