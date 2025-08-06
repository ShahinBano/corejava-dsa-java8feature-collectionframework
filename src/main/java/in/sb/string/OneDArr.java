package in.sb.string;

public class OneDArr {
    public static void main(String[] args) {
        int[] a = {2, 4, 1, 7, 8, 9};
        reverseArrayByForLoop(a);
        System.out.println();
        reverseArrByWhileLoop(a);
    }

    private static void reverseArrayByForLoop(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
    private static void reverseArrByWhileLoop(int[] a) {
        int l=0;
        int r= a.length-1;
        while (l>r){
            int temp1=a[l];
            a[l]=a[r];
            a[r]=temp1;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
}

