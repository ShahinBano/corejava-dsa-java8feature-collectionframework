package in.sb.string;

public class StringCount {
    public static void main(String[] args) {
        String str = "Learn code with Shahin";
        int count=0;
        System.out.println("Input String : "+str);
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println("The total number of characters in the given string: "+count);
    }
}
