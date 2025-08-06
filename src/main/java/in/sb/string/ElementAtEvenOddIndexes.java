package in.sb.string;

public class ElementAtEvenOddIndexes {
    public static void main(String[] args) {
        int[] arr={1,2,3,8,9,4,5};

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.println("Element of Even Index :"+arr[i]);
            }else{
                System.out.println("Element of Odd Index :"+arr[i]);
            }
        }
    }
}
