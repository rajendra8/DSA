import org.testng.annotations.Test;

public class capgemini {

    String input="Hello World";
    String output="";

    public String reversed_without_place_change(String input){
        String reversed="";
       String [] split_input_= input.split(" ");
       for (String first_string:split_input_){
           for (int i = first_string.length()-1; i <0 ; i--) {
               reversed+=first_string.charAt(i);
           }
           System.out.println(reversed);
       }
       return reversed;
    }

    @Test
    public void test(){
        output= reversed_without_place_change(input);
        System.out.println(output);
    }
}
