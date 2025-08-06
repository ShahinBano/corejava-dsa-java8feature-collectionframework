package in.sb.string;

public class SplitString {
    public static void main(String[] args) {
        String capitalState = "kolkata/westbengal,patna/bihar,bangalore/karnatka";
        String input ="bihar";
        String result="";

        String[] pairs=capitalState.split(",");

        for(int i=0;i<pairs.length;i++){

            if(pairs[i].contains(input)){
                 result= pairs[i].split("/")[0];
            }

        }
        System.out.println(result);
    }
}
