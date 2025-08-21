package coding;

import org.testng.annotations.Test;

public class Loop {

    @Test
    public void while_loop(){
        int input=1;
        while(input<=5){
            System.out.println(input);
            input++;
        }
        System.out.println("outside loop"+ input);
    }

    @Test
    public void do_while(){

        int a=6;

        do{
            System.out.println(a);
            a++;
        }while(a<5);
    }
}
