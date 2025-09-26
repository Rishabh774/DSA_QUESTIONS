package MultiDimensionalArray;

import java.util.Scanner;

public class RotateMatrix90Degree {
    // Step 1: Transpose in-place
    static void transpose(int [][]arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // Step 2: Reverse each row
    static void rotate(int mat[][]){
        transpose(mat);
        for (int i = 0; i < mat.length; i++) {
            int stcol = 0, edcol = mat[0].length - 1;
            while (stcol < edcol) {
                int temp = mat[i][stcol];
                mat[i][stcol] = mat[i][edcol];
                mat[i][edcol] = temp;
                stcol++;
                edcol--;
            }
        }
    }

    static void printmatrix(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int n = sc.nextInt();

        if (m != n) {
            System.out.println(" Rotation by 90° only works for square matrices!");
            return;
        }

        int [][] arr = new int[m][n];
        System.out.println("Enter " + (n * m) + " Elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        printmatrix(arr);

        rotate(arr);

        System.out.println("\nMatrix After 90° Rotation:");
        printmatrix(arr);
    }
}
