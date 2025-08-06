package in.sb.string;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=10;
        boolean isPrime=true;
        if(num<=1)
            isPrime=false;
        else {
            for (int i=2;i<Math.sqrt(num);i++){
                if(num%2==0)
                    isPrime=false;
                break;
            }
        }
        System.out.print("Prime number "+isPrime);
    }
}
