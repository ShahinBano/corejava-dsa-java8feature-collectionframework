package in.sb.java8.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(12,56,98,56,1,44,66,78,94,35);
        Integer max=list.stream().max(Comparator.comparingInt(n->n)).get();
        System.out.println(max);
        Integer min=list.stream().min(Comparator.comparingInt(n->n)).get();
        System.out.println(min);
    }
}
