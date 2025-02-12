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
}
