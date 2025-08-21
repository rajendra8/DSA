package coding;

import org.testng.annotations.Test;

public class Switch {

    public void switchCase(int day){

        switch (day){
            case 1:
                System.out.println("its Monday");
                break;
            case 2:
                System.out.println("its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            default:
                System.out.println("Its either holiday or not a week day");
        }
    }

    public void switch_java_17(int day){
        switch (day){
            case 1,2,3,4,5-> {
                System.out.println("its week days");
            }
            default ->
                System.out.println("Its weekend");
        }
    }

    @Test
    void test(){
        switchCase (2);
        switch_java_17(2);
    }

}
