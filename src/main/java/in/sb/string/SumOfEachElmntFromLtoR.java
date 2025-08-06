package in.sb.string;

public class SumOfEachElmntFromLtoR {
    public static void main(String[] args) {
        int[][]querie={{4,8},{3,7},{1,3},{0,4},{7,7}};
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int q = querie.length;
        sumOfEachElmntFromLtoR(a,querie,q);
    }
    private static void sumOfEachElmntFromLtoR(int[] a, int[][] querie, int q) {
        for (int i = 0; i < q; i++) {
            int l = querie[i][0];
            int r = querie[i][1];
            int sum=0;
            for (int j=l;j<=r;j++){
                sum=sum+a[j];
            }
            System.out.println(sum);
        }
    }
}
