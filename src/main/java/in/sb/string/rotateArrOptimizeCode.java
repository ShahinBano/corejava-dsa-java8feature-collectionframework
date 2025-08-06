package in.sb.string;

public class rotateArrOptimizeCode {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int n = a.length;
        int k = 3;
        rotateArr(a, n, k);

        // Print the rotated array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
    public static void rotateArr(int[] a, int n, int k) {
        reverseArr(a, 0, n - 1);
        reverseArr(a, 0, k - 1);
        reverseArr(a, k, n - 1);
    }
    public static void reverseArr(int[] a, int l, int r) {
        while (l < r) { // Corrected the condition
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}