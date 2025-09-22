package Array;

public class Ques3MoveZeros {
    // By this method we can maintain relative order of non-zero elements
    public static void movezeros(int arr[]){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0){
                arr[count++]= arr[i++];
            }
        }
        while (count<arr.length){
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
        int arr[]={1,0,2,0,3,4,0,6,7,0,8,0,10,11};
        movezeros(arr);
        printarr(arr);
    }
}
