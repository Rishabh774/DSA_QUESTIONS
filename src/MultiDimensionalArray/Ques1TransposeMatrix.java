package MultiDimensionalArray;

import java.util.Scanner;

public class Ques1TransposeMatrix {
    static int[][] transpose(int [][]arr){
        int n = arr.length;
        int m = arr[0].length;
        int ans[][]= new int[m][n];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j]= arr[j][i];
            }
        }
        return ans;
    }
    static void printmatrix(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print( arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int m = sc.nextInt();
        System.out.print("Enter number of columns :");
        int n = sc.nextInt();
        System.out.println("Enter "+n*m+" Elements :");
        int [][] arr= new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               arr[i][j]= sc.nextInt();
            }
        }
        printmatrix(arr);
        System.out.println("Transposed matrix :");
       int ans [][]= transpose(arr);
        printmatrix(ans);
    }
}
