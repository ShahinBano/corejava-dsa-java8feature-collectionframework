package in.sb.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndTwice
{
    public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        numbers.stream().filter(num->num%2==0)
//                .map(evenNum->evenNum*2).toList().forEach(System.out::println);
       numbers.stream().filter(n->n%2==0).map(n->n*2).collect(Collectors.toList()).forEach(System.out::println);



    }


}
