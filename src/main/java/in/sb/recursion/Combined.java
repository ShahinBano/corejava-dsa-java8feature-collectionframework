package in.sb.recursion;

public class Combined {
    public static void main(String[] args) {
      combined(4);
    }
    public static void combined(int N){
        if (N==1){
            System.out.print(1);
            System.out.print(1);
            return;
        }
        System.out.print(N);
        combined(N-1);
        System.out.print(N);
    }
}
