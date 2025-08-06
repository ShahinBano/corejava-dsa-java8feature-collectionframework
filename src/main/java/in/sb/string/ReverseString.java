package in.sb.string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String args[])
    {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter a String ");
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed String : 5"+reversed);
    }
}
