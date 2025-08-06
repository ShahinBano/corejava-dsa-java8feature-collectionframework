package in.sb.java8.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDecimalInReverse {
    public static void main(String[] args) {
        List<Double>decimalList= Arrays.asList(12.09,33.00,56.09,11.00,33.89,78.95);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
