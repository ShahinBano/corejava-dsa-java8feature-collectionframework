package in.sb.string;

import java.util.Scanner;

public class PrintZerothIndexRowElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Create 2D array");
        int a[][]=new int[3][4];
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
       printZerothIndexRowqElement(a);
       printZerothIndexColumnElement(a);
       printMatrixRowByRow(a);
       printRowwiseWaveForm(a);
       printColumnwiseWaveForm(a);
       printMaxOfMatrix(a);
       printMaxOfEachRow(a);
       printTransposeMatrix(a);
       printReverseMatrix(a);
       rotateMatrix90Degree(a);
    }

    private static void rotateMatrix90Degree(int[][] a) {
        System.out.println("Rotate Matrix 90 degree ");
        int transpose[][]=new int[a[0].length][a.length];
        for (int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[i].length;j++){
                transpose[i][j]=a[j][i];
            }
        }
//        for(int i=0;i<transpose.length;i++){
//            int left=0;
//            int right=transpose[i].length-1;
//            while (left<right){
//                int temp=a[i][left];
//                a[i][left]=a[i][right];
//                a[i][right]=temp;
//                left++;
//                right--;
//            }
//        }
        for (int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void printReverseMatrix(int[][] a) {
        System.out.println("Print Reverse matrix : ");
        for(int i=0;i<a.length;i++){
            int left=0;
            int right=a[i].length-1;
            while (left<right){
                int temp=a[i][left];
                a[i][left]=a[i][right];
                a[i][right]=temp;
                left++;
                right--;
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void printTransposeMatrix(int[][] a) {
        System.out.println("Print Transpose Matrix ");
        int transpose[][]=new int[a[0].length][a.length];
        for (int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[i].length;j++){
                transpose[i][j]=a[j][i];
            }
        }
        for (int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }

    private static void printZerothIndexRowqElement(int[][] a) {
        System.out.println("Printing 0th index row element ");
        for (int i=0;i<a[0].length;i++)
        {
            System.out.print(a[0][i]+" ");
        }
    }

    private static void printZerothIndexColumnElement(int[][] a) {
        System.out.println("\nPrinting 0th index column element ");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i][0]+" ");
        }
    }

    private static void printMatrixRowByRow(int[][] a) {
        System.out.println("\nPrinting matrix row by row ");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void printRowwiseWaveForm(int[][] a) {
        System.out.println("\nPrinting  row wise waveform ");

        for(int i=0;i<a.length;i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a[0].length; j++){
                    System.out.print(a[i][j]+" ");
                }
            }else {
                for (int j = a[0].length-1; j>=0;j--){
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    private static void printColumnwiseWaveForm(int[][] a) {
        System.out.println("\nPrinting  column wise waveform ");
        for(int c=0;c<a[0].length;c++) {
            if (c % 2 == 0) {
                for (int r = 0; r < a.length; r++){
                    System.out.print(a[r][c]+" ");
                }
            }else {
                for (int r=a.length-1;r>=0;r--)
                {
                    System.out.print(a[r][c]+" ");
                }
            }
            System.out.println();
        }
    }

    private static void printMaxOfMatrix(int[][] a) {
        int max=a[0][0];
        System.out.println("\nPrinting  Max of matrix ");
        for (int i =0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++){
                if(a[i][j]>max)
                    max=a[i][j];
            }
        }
        System.out.println("Max of matrix : "+max);
    }

    private static void printMaxOfEachRow(int[][] a) {
        System.out.println("\nPrinting  Max of each row ");
        int[] result=new int[a.length];
        for (int i =0;i<a.length;i++) {
            int max1=Integer.MIN_VALUE;
            for (int j=0;j<a[i].length;j++){
                if(a[i][j]>max1)
                    max1=a[i][j];
            }
            result[i]=max1;
        }
        for (int k=0;k<a.length;k++){
            System.out.print(result[k]+" ");
        }
        System.out.println();
    }
}
