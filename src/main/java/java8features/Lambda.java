package java8features;

import org.testng.annotations.Test;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * lambda epression is an anonymous function(no name, no return type, no access modifier)
 */
public class Lambda {

   public void implementLambda(){

   }
    @Test
    public void lambda_funtional_interface(){
        Predicate<Integer> isEven =x-> (x & 1) == 0;  //predicate fuctional interdface is returing only boolean valu
        System.out.println(isEven.test(16));

        Predicate<String> isWordStartwithA = x -> x.startsWith("A");
        Predicate<String> isWordEndWith = x -> x.endsWith("i");
        System.out.println(isWordStartwithA.test("Ankit"));
        System.out.println(isWordStartwithA.test("Asati"));
       Predicate<String> result=isWordStartwithA.and(isWordEndWith);
        System.out.println(result.test("Asati"));


        //Function Interface , it work for us
        Function<Integer,Integer> doublTheNumber = x -> 2*x;
        System.out.println(doublTheNumber.apply(100));

    }

    public static void main(String[] args) {
       // SumOperation sumOperation=new SumOperation();
      // int reslt= sumOperation.operate(10,12);
       // System.out.println(reslt);

      MathOperation sumOperation= ( a,b)->a+b;
      System.out.println(sumOperation.operate(12,12));

      MathOperation substraction=(a,b)->a-b;
        int result=substraction.operate(20,1);
        System.out.println(result);

       Thread t1=new Thread(() ->{
           System.out.print("lambda implementation");
       });
    }

}
/*
class SumOperation implements MathOperation{

    @Override
    public  int operate(int a, int b) {
        return a+b;
    }
}
*/
class SubtractionOperation implements MathOperation{
    @Override
    public int operate(int a, int b) {
        return a-b;
    }
}




interface MathOperation {
    int operate(int a,int b);
}





