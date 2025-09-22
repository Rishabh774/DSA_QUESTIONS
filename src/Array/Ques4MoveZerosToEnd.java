package Array;

public class Ques4MoveZerosToEnd {
    static void movezeros(int arr[]){
        int count =0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<arr.length){
            arr[count++]=0;
        }
    }
    static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int arr[]={1,0,2,10,20,0,0,25,82,0};
        System.out.print("Array before moving zeros to end:");
        printarr(arr);
        movezeros(arr);
        System.out.print("Array after moving zeros to end:");
        printarr(arr);
    }
}
