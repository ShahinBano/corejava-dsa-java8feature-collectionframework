package in.sb.recursion;

public class SumOfNaturalNO {
    public static void main(String[] args) {
        System.out.println(sums(5));
    }

    private static int sums(int N) {
        if(N==1){
            return 1;
        }
        int sum1=sums(N-1)+N;
        return sum1;
    }

}
