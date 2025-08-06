package in.sb.java8.features;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfDigit {
    public static void main(String[] args) {
        int n = 12345;
        Integer sunOfInteger = Stream.of(String.valueOf(n).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sunOfInteger);
    }
}
