package Array;

import java.util.HashMap;
import java.util.HashSet;

public class Ques10Duplicates {
    static void duplicates(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            if(set.contains(arr[i])){
                duplicates.add(arr[i]);
            }
        }
        System.out.println(duplicates);
    }
    public static void main(String[] args) {
        int arr[]= {1,1,2,33,4,4,4,5,6,6,7,8,8,8};
        duplicates(arr);
    }
}
