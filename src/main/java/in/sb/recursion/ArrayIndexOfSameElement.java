package in.sb.recursion;

public class ArrayIndexOfSameElement {

    public static void main(String[] args) {
        int[] arr={5,3,7,5,8,9,5};
        int currentIndex=0;
        int num=5;
        int currIndex=0;
        int[] indexArray = getAllIndex(arr,currentIndex,num,currIndex);
        for (int i=0;i<indexArray.length;i++){
            System.out.println(indexArray[i]);
        }
    }
    private static int[] getAllIndex(int[] arr, int currentIndex, int num,int currIndex) {
        int[] indexArr=new int[3];

        if(arr.length==currentIndex){
            return indexArr;
        }
        if(arr[currentIndex]==num){
            indexArr[currIndex]=currentIndex;
            currIndex++;
        }
        getAllIndex(arr, currentIndex+1,num,currIndex);

        return indexArr;
    }
}
