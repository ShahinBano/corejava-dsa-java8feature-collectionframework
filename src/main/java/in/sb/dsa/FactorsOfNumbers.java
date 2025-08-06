package in.sb.dsa;
import java.util.Scanner;

public class FactorsOfNumbers
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int factorCount=countFactor(num);
        System.out.println("Factor count of a number is :"+factorCount);
    }
    public static int countFactor(int num)
    {
        int count=0;
        for (int i=1;i<=num;i++)// 1,2,5,10
        {
            if(num%i==0)
            {
                count++;
            }
        }
       return count;
    }
}
