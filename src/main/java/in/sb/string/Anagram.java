package in.sb.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Study";
        String str2 = "Dusty";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length()==str2.length())
        {
            char[] charArr1 = str1.toCharArray();
            char[] charArr2 = str2.toCharArray();
            Arrays.sort(charArr1);
            Arrays.sort(charArr2);
            boolean result = Arrays.equals(charArr1,charArr2);
            if(result)
            {
                System.out.println(str1 +" and "+str2+" are Anagram of each other");
            }
            else {
                System.out.println(str1 +" and "+str2+" are not Anagram of each other");
            }
        }else {
            System.out.println(str1 +" and "+str2+" are not Anagram of each other");
        }

    }
}
