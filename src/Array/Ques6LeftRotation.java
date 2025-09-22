package Array;

import java.util.Scanner;

public class Ques6LeftRotation {
    static void rotatearr(int arr[], int k ){
        int n =arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

    }
    static void reverse(int arr[], int i, int j){
        while (i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.print("Enter how much element to be rotated : ");
        int k = sc.nextInt();
        System.out.print("Array before rotation :");
        printarr(arr);
        rotatearr(arr,k);
        System.out.print("Array after rotation  :");
        printarr(arr);
    }
}
