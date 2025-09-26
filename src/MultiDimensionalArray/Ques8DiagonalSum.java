package MultiDimensionalArray;

import java.util.Scanner;

public class Ques8DiagonalSum {
    static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum=0;
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||i+j==n-1){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
//        1   2   3   4   5
//        6   7   8   9  10
//        11  12  13  14  15
//        16  17  18  19  20
//        21  22  23  24  25   ans 130
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int m = sc.nextInt();
        System.out.print("Enter number of columns :");
        int n = sc.nextInt();
        System.out.println("Enter "+n*m+" Elements :");
        int [][] arr= new int[m][n];
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println(diagonalSum(arr));
    }
}
