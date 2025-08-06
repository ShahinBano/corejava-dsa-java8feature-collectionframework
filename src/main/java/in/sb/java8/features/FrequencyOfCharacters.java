package in.sb.java8.features;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String name = "My name is Shahin";
        Map<Character,Long>frequency=name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.print(frequency);
    }
}
