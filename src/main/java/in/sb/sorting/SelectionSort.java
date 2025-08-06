package in.sb.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[]{8,1,9,3,5,2,7,6};
        int temp;
        for (int i=0;i<a.length;i++){
            int min=i;
            for (int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
       for (int i=0;i<a.length;i++){
           System.out.println(a[i]+" ");
       }
    }
}
