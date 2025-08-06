package in.sb.sorting;

public class BubblSort {
    public static void main(String[] args) {
        int[] a = new int[]{8,1,9,3,7,2,6};
        for (int i=0;i<a.length;i++){
            boolean flag=false;
            for (int j=0;j<a.length-i-1;j++){
               if(a[j]>a[j+1]){
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                   flag=true;
               }
            }
            if(flag==false){
                break;
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}
