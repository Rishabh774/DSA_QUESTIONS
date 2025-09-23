package String;

import java.util.Scanner;

public class Ques1RevString {
    static String revstring(String str ){
        int n = str.length();
        String ans ="";

        for (int i = n-1; i >=0 ; i--) {
            ans+=str.charAt(i);
        }
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :" );
        String  str = sc.nextLine();
        String ans = revstring(str);
        System.out.print(ans);
    }
}
