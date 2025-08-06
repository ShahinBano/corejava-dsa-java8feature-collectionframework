package in.sb.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    private static int fact(int N) {
        if(N==1){
           return 1;
        }
       int ans=fact(N-1)*N;
        return ans;
    }
}
