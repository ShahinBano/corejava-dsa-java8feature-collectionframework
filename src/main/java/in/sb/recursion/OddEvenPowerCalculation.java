package in.sb.recursion;

public class OddEvenPowerCalculation {
    public static void main(String[] args) {
        System.out.println( oddEvenPow(2,6));
    }

    private static int oddEvenPow(int a, int n)
    {
        if(n==0)
            return 1;
        if (n%2==0){
            int ans=oddEvenPow(a,n/2)*oddEvenPow(a,n/2);
            return ans;
        }else {
            int ans=a*oddEvenPow(a,n/2)*oddEvenPow(a,n/2);
            return ans;
        }
    }
}
