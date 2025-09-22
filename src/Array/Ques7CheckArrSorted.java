package Array;

public class Ques7CheckArrSorted {
    static boolean issorted(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,10,5,6,7,8,9};
        System.out.println(issorted(arr));
    }
}
