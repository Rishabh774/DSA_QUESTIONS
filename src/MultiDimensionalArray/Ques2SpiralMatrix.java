package MultiDimensionalArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques2SpiralMatrix {

    static List<Integer> spiralOrder(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        int n =mat.length, m = mat[0].length;
        int fr=0, lr =n-1,fc=0, lc=m-1;
        int size=n*m;
        while (fr<=lr && fc<=lc){
            for (int i = fc; i <=lc ; i++) {
                list.add(mat[fr][i]);
            }
            if(list.size()==size) break;
            fr++;
            for (int i = fr; i <=lr ; i++) {
                list.add(mat[i][lc]);
            }
            if(list.size()==size) break;

            lc--;
            for (int i = lc; i >=fc ; i--) {
                list.add(mat[lr][i]);
            }
            if(list.size()==size) break;

            lr--;
            for (int i = lr; i >=fr ; i--) {
                list.add(mat[i][fc]);
            }
            if(list.size()==size) break;

            fc++;


        }
        return list;
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
        System.out.println(spiralOrder(arr));
    }
}
