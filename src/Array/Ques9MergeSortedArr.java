package Array;

public class Ques9MergeSortedArr {

    public static void main(String[] args) {
        int arr1[]={1,2,3,0,0,0};
        int arr2[]={2,5,6};
        merge(arr1,3,arr2,3);
        printarr(arr1);
    }
    static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

         static void merge(int[] nums1, int m, int[] nums2, int n) {
            int i= m-1;
            int j =n-1;
            int k =m+n-1;
            while(i>= 0 && j>=0){
                if(nums1[i]>nums2[j]){
                    nums1[k--]=nums1[i--];
                }
                else{
                    nums1[k--]=nums2[j--];
                }
            }
            while(j>= 0){
                nums1[k--]=nums2[j--];
            }
        }

}
