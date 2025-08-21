import coding.Switch;
import com.mobile.appium.Sorting;
import org.testng.annotations.Test;

public class Coforge {

    public static boolean isPrime(int number){

        if(number==1){
            return false;

        }
        double sqrt= Math.sqrt(number);

        for(int i=2;i<=sqrt; i++){

            if(number% i==0){

                System.out.println("number is not prime : "+ number);
                return false;
            }else {
                System.out.println("number is prime : "+ number);
            }

        }

        return true;

    }

    public static void primeNumber(){

        int []arr={2,3,4,5,6,43,23,2,34,6,5,8,7,4,13,11,17,19,23,29,37};

        for(int a:arr){
            isPrime(a);
        }

    }

    public static void main(String[] args) {
        primeNumber();
    }

    /**
     *
     //String str = "My name is Rajendra Sahu";
        each Lower char should be in upper and upper should be lower case
     */


    @Test
    public void lowwerToupper_upperToLower(){

        String input="My name is Rajendra Sahu";
        String output="";
        StringBuilder st=new StringBuilder();
        for(char c:input.toCharArray()){
            if(Character.isLowerCase(c)){
               // st.append(Character.toString(c).toUpperCase());
                output+=Character.toString(c).toUpperCase();
            } else if (Character.isUpperCase(c)) {
               // st.append(Character.toString(c).toLowerCase());
                output+=Character.toString(c).toLowerCase();
            } else if (Character.isSpaceChar(c)) {
                output+=" ";
            }
        }
        System.out.print(output);

    }

    @Test
    public void ChararcterTest(){
        String input="12 is not 24  Sahu";
        String output="";
        for (char c:input.toCharArray()){
            if(Character.isDigit(c)){

                switch (c){
                    case 49:
                        output+="one";
                        System.out.println("one");
                        break;
                    case 50:
                        output+="two";
                        System.out.println("two");
                        break;

                    case 51:
                        output+="thress";
                        System.out.println("three");
                        break;
                    case 52:
                        output+="four";
                        System.out.println("Four");
                        break;
                    case 5:
                        output+="five";
                        System.out.println("Five");
                        break;
                    default:
                        System.out.println("not a valid number");
                        break;

                }

            } else {
                output+=Character.toString(c);
            }
        }
        System.out.println(output);
    }

}
