package in.sb.string;

public class PrefixSum {
    public static void main(String[] args) {
        int[][]querie={{4,8},{3,7},{1,3},{0,4},{7,7}};
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int[] prefixSum = new int[a.length];
        prefixSum[0]=a[0];
        for(int i=1;i<a.length;i++){
            prefixSum[i]=prefixSum[i-1]+a[i];
        }
        int q = querie.length;
        sumOEachElmntFromLToR(prefixSum,querie,q);
    }

    private static void sumOEachElmntFromLToR(int[] prefixSum, int[][] queries, int q) {
        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int sum=0;
            if (l==0){
                sum=prefixSum[r];
            }else {
                sum=prefixSum[r]-prefixSum[l-1];
            }
            System.out.println(sum);
        }
    }

}



