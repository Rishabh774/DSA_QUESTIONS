package String;

import java.util.Scanner;

public class Ques2palindrome {
    static boolean ispalindrome(String str){
        str= str.toLowerCase();
        int n = str.length();
        int i=0;
        int j =n-1;
      while (i<j) {
          char ch1 = str.charAt(i);
          char ch2 = str.charAt(j);
          if (!Character.isLetterOrDigit(i)) {
              i++;
              continue;
          }
          if (!Character.isLetterOrDigit(j)) {
              j--;
              continue;


//          if (!(ch1 >= 'a' && ch1 <= 'z' || ch1 > '0' && ch1 <= '9')) {
//              i++;
//              continue;
//          }
//          if (!(ch2 >= 'a' && ch2 <= 'z' || ch2 > '0' && ch2 <= '9')) {
//              j--;
//              continue;
          }
          if (Character.isLetterOrDigit(i)!= Character.isLetterOrDigit(j)) {
              return false;
          }
          i++;
          j--;

      }


      return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String  str = sc.nextLine();
        System.out.println(ispalindrome(str));
    }
}
