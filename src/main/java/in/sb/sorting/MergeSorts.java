package in.sb.sorting;

public class MergeSorts {
    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String[] args) {
        int[] inputArr = {48,36,13,52,19,21};
        MergeSorts ms = new MergeSorts();
        ms.sort(inputArr);
        for (int i : inputArr){
            System.out.println(i+" ");
        }

    }
    private void sort(int[] inputArr) {
        this.array=inputArr;
        this.length= inputArr.length;
        this.tempMergeArr=new int[length];
        divide(0,length-1);
    }

    private void divide(int lowerIndex, int higherIndex) {
        if (lowerIndex<higherIndex){
            int middle = lowerIndex+(higherIndex-lowerIndex)/2;
            divide(lowerIndex,middle);
            divide(middle+1,higherIndex);
            MergeArray(lowerIndex, middle ,higherIndex);
        }
    }

    private void MergeArray(int lowerIndex, int middle, int higherIndex) {
        for (int i=lowerIndex;i<=higherIndex;i++){
         tempMergeArr[i]=array[i];
        }
        int i=lowerIndex;
        int j=middle+1;
        int k=lowerIndex;
        while (i<=middle && j<=higherIndex){
            if (tempMergeArr[i]<=tempMergeArr[j]){
                array[k]=tempMergeArr[i];
                i++;
            }else {
                array[k]=tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i<=middle){
            array[k]=tempMergeArr[i];
            k++;
            i++;
        }
    }
}
