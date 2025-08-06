package in.sb.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurences {
    public static void main(String[] args) {
        String input=" My name is shahin ";
        Map<Character, Integer> strCount= new HashMap<>();
        for (char ch:input.toCharArray())
        {
            if(strCount.containsKey(ch)){
                strCount.put(ch, strCount.get(ch)+1);
            }
            else {
                strCount.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer>oc:strCount.entrySet())
        {
            System.out.println(oc.getKey()+" "+oc.getValue());
        }
    }
}
