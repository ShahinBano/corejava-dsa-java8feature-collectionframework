package in.sb.string;

public class ReverseWordInString {
    public static void main(String[] args) {
        String input="My name is shahin";
        String words[]=input.split(" ");
        StringBuilder result=new StringBuilder();
      for(int i=0;i<words.length;i++)
        {
            StringBuilder reversedWord=new StringBuilder(words[i]).reverse();
            result.append(reversedWord).append(" ");
        }
      System.out.println("Original "+input);
      System.out.println("Reversed Word "+result.toString().trim());
    }
}
