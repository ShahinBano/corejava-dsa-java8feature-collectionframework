package in.sb.string;

import java.util.Scanner;

public class Palindrom {
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.nextLine();

//        String reverseString = new StringBuilder(input).reverse().toString();
//        if (input.equals(reverseString))
//        {
//            System.out.println(reverseString+" is a palindrome");
//        }
//        else {
//            System.out.println(reverseString+" is not a palindrome");
//        }

        boolean isPalindrome = true;
        for (int i=0;i<input.length()/2;i++)    // madam
        {
            if (input.charAt(i)!=input.charAt(input.length()-i-1))
            {
                isPalindrome=false;
                break;
            }
        }
        System.out.println(input+ " is Palindrome: "+isPalindrome );

    }
}
