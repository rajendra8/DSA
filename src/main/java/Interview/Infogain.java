package Interview;


import org.testng.annotations.Test;

/**
 * b%s&k*l
 * O/P : bskl%&*
 */
public class Infogain {

    @Test
    public void test(){
        String in="b%s&k*l";

        StringBuilder stringBuilder=new StringBuilder();
        StringBuilder special=new StringBuilder();
/**
        //First approach
        for(char c:in.toCharArray()){
            if(c>='a' || c>='z'){
              stringBuilder.append(c);
            }else {
                special.append(c);
            }

        }
        System.out.println(stringBuilder.toString()+special.toString());
**/

        //Second Approach
        for(char c:in.toCharArray()){
            if(Character.isLetter(c)){
                stringBuilder.append(c);
            } else  {
                special.append(c);

            }
        }
        System.out.println(stringBuilder.toString()+ special.toString());
    }
}
