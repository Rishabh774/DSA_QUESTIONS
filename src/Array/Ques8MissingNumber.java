package Array;

public class Ques8MissingNumber {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9,10};
        //System.out.println(missingnumber(arr));
     findMissing(arr);
    }

    private static int missingnumber(int arr[]) {
        int n = arr.length + 1;  // total numbers should be length+1
        int sum = 0;
        int actualsum = (n * (n + 1)) / 2; // sum of 1 to n
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return actualsum - sum;
    }
    private static void findMissing(int arr[]) {
        int start = arr[0];
        int end = arr[arr.length - 1];
        for (int i = start; i <= end; i++) {
            boolean found = false;
            // check if i exists in arr
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break; // stop searching once found
                }
            }
            // if not found → missing number
            if (!found) {
                System.out.println("Missing number: " + i);
            }
        }
    }

}
