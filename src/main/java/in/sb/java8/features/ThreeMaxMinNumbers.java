package in.sb.java8.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxMinNumbers {
    public static void main(String[] args) {
        List<Integer>listOfNumbers= Arrays.asList(12,4,66,78,45,98,66,1,3,5);
        listOfNumbers.stream().sorted().limit(3).forEach(System.out::println);
        System.out.println("--------------------");
        listOfNumbers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
