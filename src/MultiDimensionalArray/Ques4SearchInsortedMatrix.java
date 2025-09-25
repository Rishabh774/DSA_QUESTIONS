package MultiDimensionalArray;

import java.util.Scanner;

public class Ques4SearchInsortedMatrix {
    static boolean searchMatrix(int[][] arr, int target) {
        int n= arr.length;
        int m = arr[0].length;
        int i=0;
        int j = m-1;
        while(i<n && j>=0){
            if(target == arr[i][j]
            ){
                return true;
            }
            else if(target <arr[i][j]){
                j--;
            }
            else {
                i++;
            }
        }
        return false;
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
        // example of row and column wise sorted matrix
//        1   4   7   11
//        2   5   8   12
//        3   6   9   16
//        10 13  14   17
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
        System.out.println(searchMatrix(arr,14));
    }
}
