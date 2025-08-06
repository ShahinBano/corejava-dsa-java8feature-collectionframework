package in.sb.java8.features;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        s1= Stream.of(s1.split("")).map(s->s.toUpperCase()).sorted().collect(Collectors.joining());
        s2= Arrays.stream(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println(s1);
        System.out.println(s1.equals(s2));
    }
}
