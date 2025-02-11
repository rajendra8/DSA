package Interview;


import java.util.*;

/***
 * Question :"12311,45289,990011,45,78" in a given Int array if the number is repeated then it is eligible for addition else not.
 * Excepted O/P:1+2+3+1+1,45289,9+9+0+0+1+1,45,78
 * 990011
 * 12311
 */
public class Zycus {


    public static void main(String[] args) {
        //String []ab="12311".split("");

        addingNumIfRepeated();

    }

    public static void addingNumIfRepeated(){
            String a="12311";
            String result="";
        String []ab="12311".split("");
        for (String ac:ab) {
            if(result.contains(ac)){
                System.out.println("its present in array"+result);
            }else {
                result= result + ac;
            }

        }

        System.out.println(result);
    }

}
