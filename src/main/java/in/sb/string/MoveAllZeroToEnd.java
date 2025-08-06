package in.sb.string;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[]arrNew=moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] moveZeroes(int[] arr) {
        int countZero = 0; // Count of non-zero elements
        //int newArr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
        }
        int k=0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != 0)
            {
                arr[k] = arr[i];
                k++;
            }
        }
        for(int i = k; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
 }
}
