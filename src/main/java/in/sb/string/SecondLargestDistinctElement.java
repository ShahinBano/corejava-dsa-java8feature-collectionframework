package in.sb.string;

public class SecondLargestDistinctElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1,34,36,35};//35,35,34,12,10,1,1
        System.out.println("Second largest element is: " + getSecondLargest(arr));
    }
    private static int getSecondLargest(int[] arr)
    {        int secondLargestNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }
        }
        if (arr.length < 2) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < arr[0]) {
                    secondLargestNumber = arr[i];                    break;                }            }        }        return secondLargestNumber;
    }
}
