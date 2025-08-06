package in.sb.java8.features;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoUnsortedArrayInOneSortedArrayWithoutDuplicate {
    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 7, 1, 2};
        int[] b = new int[]{8, 3, 9, 5, 9};
        int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(c));
    }
}
