package Array;

public class Ques3SecondLargest {
    public static int secondlargest(int arr[]){
        int max = Integer.MIN_VALUE;
        int smax= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                smax=max;
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (smax<arr[i] && max!=arr[i]){
                smax=arr[i];
            }
        }
        return (smax==Integer.MIN_VALUE) ?-1:smax;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(secondlargest(arr));
    }
}
