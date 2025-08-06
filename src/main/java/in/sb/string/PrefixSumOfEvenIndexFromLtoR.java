package in.sb.string;

public class PrefixSumOfEvenIndexFromLtoR {
    public static void main(String[] args) {
        int[][]querie={{4,8},{3,7},{1,3},{0,4},{7,7}};
        int[] a={1,2,3,4,5,6,7,8,9,10};
        for(int i=1;i<a.length;i++) {
            if (i % 2 == 0) {
                a[i] = a[i - 1] + a[i];
            }else {
                a[i]=a[i-1];
            }
        }
        int q = querie.length;
        sumOEachElmntFromLToR(a,querie,q);
    }
    private static void sumOEachElmntFromLToR(int[] a, int[][] queries, int q) {
        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if (l==0){
               System.out.println(a[r]);
            }else {
               System.out.println(a[r]-a[l-1]);
            }
        }
    }
}
