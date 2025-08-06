package in.sb.string;

public class CountingVowelsAndConsonants {
    public static void main(String[] args) {
        String input = "Automation World";
        input=input.toLowerCase();
        int vowels=0;
        int consonants=0;
        for (int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels : "+vowels+ " and  consonants : "+consonants);
    }
}
