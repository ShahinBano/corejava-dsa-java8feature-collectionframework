package in.sb.array;

public class Rotate2DMatrixBy90Degree {
    public static void main(String[] args) {
        int[][] a={{1,3,3},{4,5,7},{7,8,9}};
        int[][] t=transposeMatrix(a);
        reversetwoDMatrix(t);
        for (int i=0;i<t.length;i++){
            for (int j=0;j<t.length;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void reversetwoDMatrix(int[][] a) {
        for (int i=0;i<a.length;i++){
            int l=0;
            int r=a[0].length;
            while (l<r){
                int temp = a[i][l];
                a[i][l]=a[i][r-1];
                a[i][r-1]=temp;
                l++;
                r--;
            }
        }
    }

    private static int[][] transposeMatrix(int[][] a) {
        int transposeMat[][]=new int[a.length][a.length];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                transposeMat[i][j]=a[j][i];
            }
        }
        return transposeMat;
    }

}
