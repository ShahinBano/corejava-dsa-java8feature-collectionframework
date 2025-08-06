package in.sb.sorting;
public class MergeSort {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,5,7,4,3};
        int[] b = new int[]{12,4,7,6,8,9,11,3,6};
        int[] c = new int[a.length+b.length];
        int[] result = new int[c.length];
        for (int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[a.length+j] = b[j];
        }
        for (int i=0;i<c.length-1;i++){
           for (int j=0;j<c.length-1-i;j++){
               if(c[j]>c[j+1]){
                  int temp=c[j];
                  c[j]=c[j+1];
                  c[j+1]=temp;

               }
           }
        }
        for (int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
