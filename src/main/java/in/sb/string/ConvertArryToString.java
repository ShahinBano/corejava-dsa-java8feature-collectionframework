package in.sb.string;

import java.util.Arrays;

public class ConvertArryToString
{
    public static void main(String[] args) {
        String strArray[] = {"Apple","Banana","Grape","Papaya"};
        String str1 = coverArryToStr(strArray);
        System.out.println("An array converted to a string: " + str1);
    }

    private static String coverArryToStr(String[] strArray)
    {
      return Arrays.toString(strArray);
    }
}
