package in.sb;

public class ReverseWord {
    public static void main(String[] args) {
        String input= "My name is shahin";
        String[] word = input.split(" ");//
        int l=0;
        int r= word.length;
        while (l<r){
            String temp=word[l];
            word[l]=word[r-1];
            word[r-1]=temp;
            l++;
            r--;
        }
        for (String s:word){
            System.out.println(s);
        }
    }

}
