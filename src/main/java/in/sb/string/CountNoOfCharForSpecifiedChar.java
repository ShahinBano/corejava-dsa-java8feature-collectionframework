package in.sb.string;

public class CountNoOfCharForSpecifiedChar
{
    public static void main(String[] args) {
        String str = "Learn code with shahin";
        int count = 0;
        char ch='e';
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
                count++;
        }
        System.out.println("The character '" + ch + "' appears " + count + " times in the given string '" + str + "'.");
    }
}
