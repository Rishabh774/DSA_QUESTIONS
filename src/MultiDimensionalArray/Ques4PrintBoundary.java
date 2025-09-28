package MultiDimensionalArray;

import java.util.Scanner;

public class Ques4PrintBoundary {
    static void printBoundary(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int lr = 0, hr = n - 1, lc = 0, hc = m - 1;

        // Top row
        for (int i = lc; i <= hc; i++) {
            System.out.print(mat[lr][i] + " ");
        }

        // Right column
        for (int i = lr + 1; i <= hr; i++) {
            System.out.print(mat[i][hc] + " ");
        }

        // Bottom row (if more than 1 row)

            for (int i = hc - 1; i >= lc; i--) {
                System.out.print(mat[hr][i] + " ");
            }


        // Left column (if more than 1 column)

            for (int i = hr - 1; i > lr; i--) {
                System.out.print(mat[i][lc] + " ");
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int m = sc.nextInt();
        System.out.print("Enter number of columns :");
        int n = sc.nextInt();
        System.out.println("Enter " + n * m + " Elements :");
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printBoundary(arr);
    }
}
