package in.sb.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ReadDbDataIntoMap {
    public static void main(String[] args) {

        List<Student>list=new ArrayList<>();
        list.add(new Student(1,"shahin",25,"M.tech","Lucknow","99765432"));
        list.add(new Student(2,"subhash",32,"M.tech","Lucknow","99765432"));
        list.add(new Student(3,"Alok",25,"M.tech","Lucknow","99765432"));
        list.add(new Student(4,"Mohit",25,"M.tech","Lucknow","99765432"));
        list.add(new Student(5,"Priya",25,null,null,"99765432"));

    readDataFromDb(list);
    }

    private static void readDataFromDb(List<Student> list) {
        Map<Integer,Integer>map=new TreeMap<>();
        for (Student s:list){
            if((s.getHighestEducation()!=null && !s.getHighestEducation().isEmpty())
                    && (s.getAddress()!=null && !s.getAddress().isEmpty())){
                map.put(s.getId(),s.getAge());
            }

        }
        for (Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.println("Id : "+entry.getKey()+" Age: "+entry.getValue());
        }


    }

}
