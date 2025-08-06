package in.sb.java8.features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfListInMap {
    public static void main(String[] args) {

        List<Integer> integerList=new ArrayList<>();
        integerList.add(15);
        integerList.add(10);
        integerList.add(2);
        integerList.add(3);
        integerList.add(10);
        integerList.add(15);
        integerList.add(6);
        integerList.add(10);
        integerList.add(6);

        Integer[] arr={15,10,2,3,10,15,6,10,6};
        Map<Integer,Long> frequencyCheck=new HashMap<>();
        Long count= 1L;
        for(Integer key:arr){
            if(frequencyCheck.containsKey(key)){
                frequencyCheck.put(key, frequencyCheck.get(key)+1);
            }else {
                frequencyCheck.put(key,count);

            }
        }
        System.out.println("No. of frequency of each element :");
        for (Map.Entry entry:frequencyCheck.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
