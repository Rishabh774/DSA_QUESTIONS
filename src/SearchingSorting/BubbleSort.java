package SearchingSorting;

public class BubbleSort {
    static void BubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp= arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]= temp;
                }
            }
        }
    }
    static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int arr[]={10,2,1,82,56,45,52};
       BubbleSort(arr);
       printarr(arr);
    }
}
