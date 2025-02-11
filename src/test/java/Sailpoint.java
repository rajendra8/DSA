import java.util.Arrays;

public class Sailpoint {

    //input = {1,0,0,1,1,0,1,0,0,1,1};
 //output = {0,0,0,0,0,1,1,1,1,1};
    public static void main(String[] args) {
        shifAll_one_ToEnd_of_Array();
    }

    public static  void shifAll_one_ToEnd_of_Array(){

        int a=1010101>>10;
        System.out.println(a);
        int [] input={1,0,0,1,1,0,1,0,0,1,1};
           int []output=new int[input.length];
           int j=output.length-1;
           int k=0;
        System.out.println("j : "+j);
        for(int i = 0; i < input.length ;i++) {
            if(input[i]==0){
                output[k]=input[i];
                k++;
            }else {
                output[j]=input[i];
                j--;
            }
        }
        System.out.println(Arrays.toString(output));
    }


}
