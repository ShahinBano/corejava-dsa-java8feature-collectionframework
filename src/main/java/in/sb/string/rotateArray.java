package in.sb.string;

public class rotateArray {
    public static void main(String[] args) {
        int k=4;
        int[] a={1,2,3,4,5,6};
        int[] result=rotateArr(a,k);
        for (int i=0;i<a.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] rotateArr(int[] a, int k){
        for (int i=1;i<=k;i++){
            int lastElement=a[a.length-1];
            for(int j=a.length-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=lastElement;
        }
        return a;
    }
}
