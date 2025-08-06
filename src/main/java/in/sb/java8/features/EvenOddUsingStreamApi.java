package in.sb.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddUsingStreamApi {
    public static void main(String[] args) {
        List<Integer> listNo = Arrays.asList(1,2,3,4,5,6,7);

        Map<Boolean,List<Integer>>evenodd=listNo.stream().collect(Collectors.partitioningBy(n->n%2==0));
        for (Map.Entry<Boolean,List<Integer>>entry: evenodd.entrySet()){
            if (entry.getKey()){
                System.out.println("Even numbers: "+entry.getValue());
            }
            else {
                System.out.println("Odd numbers: "+entry.getValue());
            }
        }

    }
}
