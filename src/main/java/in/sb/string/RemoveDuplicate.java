package in.sb.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Integer num[]={1,3,2,3,2,4,5,5,6,9,4,9};
        Set<Integer>uniqueSet=new HashSet<>(Arrays.asList(num));
        Integer uniqueNum[]=uniqueSet.toArray(new Integer[0]);
        System.out.print(uniqueSet);
        System.out.print(Arrays.toString(uniqueNum));
    }
}
