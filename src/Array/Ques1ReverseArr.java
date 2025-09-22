package Array;

public class Ques1ReverseArr {
    public static void reversearr(int arr[]){
        int n = arr.length;
        int i = 0;
        int j=n-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
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
        int arr[]={1,2,3,4,56,78,10,20,};
        System.out.print("Original array :");
        printarr(arr);
        reversearr(arr);
        System.out.print("Reversed array:");
        printarr(arr);

    }
}
