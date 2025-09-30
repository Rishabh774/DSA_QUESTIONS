package SearchingSorting;

public class LinearSesarch {
    static boolean linearsearch(int arr[], int target ){
        int n= arr.length;
        for (int i = 0; i <n ; i++) {
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(linearsearch(arr,9));
    }
}
