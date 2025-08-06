package in.sb.string;

public class LargestNumber {
    public static void main(String[] args) {
        int num[]={ 1,5,7,8,11,13};
        int max=num[0];
        for (int i=0;i<num.length;i++)
        {
            if(num[i]>max)
                max=num[i];
        }
        System.out.println("Largest number is : "+max);
    }
}
