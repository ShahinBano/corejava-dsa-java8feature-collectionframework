package in.sb.string;

public class SmallestNumber {
    public static void main(String[] args) {
        int num[] = {0,4,8,44,66,87,};
        int min=num[0];
        for (int i=0;i<num.length;i++)
        {
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Smallest number is: "+min);
    }
}
