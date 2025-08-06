package in.sb.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOfFive {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        list.stream().filter(n->n%5==0).collect(Collectors.toList()).forEach(System.out::println);
    }
}
