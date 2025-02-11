package Interview;

class  Redbus {




    public static void main(String[] args) {
        String input="Hello world ,how are you doing".toLowerCase();
       // test(input);
        countTheCharacter(input);
    }


    public static void test(String input){

        String []s=input.split("");
          String temp="";
          int maxcount=0;
          int secondmax=0;


        for (int i = 0; i < s.length; i++) {  //i=h

            for (int j = i+1; j <s.length ; j++) {  //j=1
                if(s[i].equals(s[j])){
                    temp=s[i];
                    secondmax =secondmax+1;
                }
            }
            System.out.println(temp);
        }
        System.out.print(maxcount +" "+ temp);
    }

    public static void countTheCharacter(String s){

        int [] array=new int[256];

        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i)]++;
        }

        for (int i = 0; i <256 ; i++) {
            if(array[i]>0){
                System.out.println((char)i +" : " + array[i]);
            }
        }
    }
}
