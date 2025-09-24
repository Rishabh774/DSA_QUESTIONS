package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Ques3RemoveDuplicates {
     static String removedupliacate(String str){
         LinkedHashSet<Character> ans = new LinkedHashSet<>();
        char[] chararr=str.toCharArray();
         for (int  i = 0; i <chararr.length; i++) {
            ans.add(chararr[i]);

         }
         StringBuilder sb = new StringBuilder();
         for (char c : ans) {
             sb.append(c);
         }

         return sb.toString();
     }


    public static void main(String[] args) {
        String str = "aaaaa";
        System.out.println(removedupliacate(str));
    }
}
