package in.sb.string;

import java.util.ArrayList;
import java.util.List;

public class EvenAndOdd {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,};
        List<Integer>evenNum=new ArrayList<>();
        List<Integer>oddNum=new ArrayList<>();
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0)
                evenNum.add(num[i]);
            else
                oddNum.add(num[i]);
        }
        System.out.println(evenNum);
        System.out.println(oddNum);
    }
}
