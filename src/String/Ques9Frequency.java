package String;

import java.util.HashMap;
import java.util.Scanner;

public class Ques9Frequency {
     static void countfre(String str){
         HashMap<Character, Integer> map = new HashMap<>();
         for (int i = 0; i < str.length(); i++) {
             if(map.containsKey(str.charAt(i))){
                 map.put(str.charAt(i),map.get(str.charAt(i))+1);
             }
             else {
                 map.put(str.charAt(i),1);
             }
         }
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :" );
        String  str = sc.nextLine();
        countfre(str);
    }
}
