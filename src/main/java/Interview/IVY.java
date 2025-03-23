package Interview;

public class IVY {

   // static String input ="Mahendra singh Dhoni";
    static String input ="Rajendra kumar Sahu";
   // Output=M.S.Dhoni

    /**
     *  Logic=
     *     1.
    **/




    public static void sortName(String input){
       String  output="";
      String [] inputArray=input.split(" ");

        for (int i = 0 ;i <inputArray.length-1 ; i++) {
           // size=2;

          //  output+=Character.toUpperCase(inputArray[i].charAt(0));
            output+=inputArray[i].charAt(0);
            if(i<inputArray[i].length()-1){
                output+=".";
            }

        }
        output+=inputArray[inputArray.length-1];
        System.out.println(output);
    }

    public static void test(){
        String in="abcdeAabcdffghijk";
        String ot="";
        int freq=0;
        int[] out=new int [in.length()-1];
        for (int i=in.length()-1;i>0;i--) {
            ot+=in.charAt(i);


        }
        System.out.println(ot);
    }

    public static void main(String[] args) {
       // sortName(input);
        test();
    }
}
