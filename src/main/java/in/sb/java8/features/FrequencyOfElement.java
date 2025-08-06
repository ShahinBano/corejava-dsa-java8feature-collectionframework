package in.sb.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElement {
    public static void main(String[] args) {
        List<String>stationaryList= Arrays.asList("Pencil","Pen","Notebook","Pencil","Pen","Stapler");
        Map<String,Long> stationaryMap=stationaryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.print(stationaryMap);
    }
}
