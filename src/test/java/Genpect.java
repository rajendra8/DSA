public class Genpect {

    public static void main(String[] args){
        int x=120, y=120;
        String s1="Thank", s2="Thank";
        int arr1[]={1,2,3};
        int arr2[]={1,2,3,5};
        boolean boo=true;

        System.out.println("x==y:"+(x==y));
        System.out.println("x<=y:"+(x<=y));
        System.out.println("s1==s2:"+(arr1==arr2));
        System.out.println("boo==true:"+(boo==true));

    }
    public static void mainS(String[]args){
        int[][] x;
        x=new int[3][4];
        for(int i=0; i<3;i+=2){
            for(int j=0; j<4; j++){
                x[i][j]=i+j;
                System.out.print(x[i][j]+" ");
            }
        }
    }
}

