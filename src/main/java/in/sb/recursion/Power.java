package in.sb.recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(powers(2,4));
    }

    private static int powers(int a, int n) {
        if(n==0)
            return 1;
     int ans=powers(a, n-1)*a;
     return ans;
    }
}
