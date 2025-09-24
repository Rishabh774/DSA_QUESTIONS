package Array;

import java.util.HashMap;

public class Ques5CountFre {
    static void counfre(int arr[]){
        int n = arr.length;
        HashMap<Integer,Integer> map= new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1 );
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
       int arr[]= {1,1,2,33,4,4,4,5,6,6,7,8,8,8};
       counfre(arr);
    }
}
