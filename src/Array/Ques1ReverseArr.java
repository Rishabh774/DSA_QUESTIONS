package Array;

public class Ques1 {
    public static void reversearr(int arr[]){
        int i = 0;
         int j = arr.length-1;
         while (i<j){
             int temp = arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
         }
    }

   public static void printyarr(int arr[]){
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }
    public static void main(String[] args) {
        int arr[]={1,2,20,25,30,85,10};
        System.out.print("Original array: ");
        printyarr(arr);
        reversearr(arr);
        System.out.print("Reversed array: ");
        printyarr(arr);
    }
}
