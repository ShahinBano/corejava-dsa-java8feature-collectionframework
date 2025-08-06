package in.sb.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElmntFromList {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String>listOfStr=listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.print(listOfStr+" ");
    }
}
