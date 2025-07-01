package java8features;

/**
 * lambda epression is an anonymous function(no name, no return type, no access modifier)
 */
public class Lambda {

   public void implementLambda(){

   }

    public static void main(String[] args) {

       Thread t1=new Thread(() ->{
           System.out.printf("lambda implementation");
       });
    }

}

