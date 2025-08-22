package in.sb.map;

import java.util.*;
import java.util.stream.Collectors;

public class TrickyMapTest {
    public static void main(String[] args) {

        Map<Integer,Student> studentMap = new HashMap<>();

        Student student1 = new Student(1,"Shahin",26);
        Student student2 = new Student(2,"Priya",27);
        Student student3 = new Student(3,"Jiya",35);
        Student student4 = new Student(4,"Siya",12);
        Student student5 = new Student(5,"Karan",13);

        studentMap.put(101,student1);
        studentMap.put(102,student2);
        studentMap.put(103,student3);
        studentMap.put(104,student4);
        studentMap.put(105,student5);

      Map<Integer,Student> sortedMap = studentMap.entrySet().stream()
              .sorted(Map.Entry.comparingByValue(Comparator.comparing(Student::getName)))
              .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1,e2)->e1,LinkedHashMap::new
              ));
        sortedMap.forEach((k,v)->System.out.println(k+" "+v));
    }
}
