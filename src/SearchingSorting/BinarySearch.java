package SearchingSorting;

import java.util.Scanner;

public class BinarySearch {
    public static boolean binarysearch(int arr[], int target){
        int n= arr.length;
        int st=0;
        int end= n-1;
        while (st<=end){
            int mid =st+(end-st)/2;
            if (arr[mid]==target) return true;
            else if (arr[mid]<target) {
                st= mid+1;
            }
            else {
                end= mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array elements :");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter "+n+" elements in sorted order :");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target element : ");
        int target =sc.nextInt();
        System.out.println(binarysearch(arr,target));
    }
}
