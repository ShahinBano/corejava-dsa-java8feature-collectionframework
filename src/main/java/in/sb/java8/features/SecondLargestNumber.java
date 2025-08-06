package in.sb.java8.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,22,23,12,4,3,33,55,65);
        Integer secondLastNumber=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLastNumber);
    }
}
