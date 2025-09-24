package String;

import java.util.Arrays;

public class Ques6Anagram {
    static boolean anagramcheck(String s1, String s2){
        if(s1.length()!= s2.length()) return false;
        char [] ch1= s1.toCharArray();
        char [] ch2=s2.toCharArray();
        Arrays.sort(ch2);
        Arrays.sort(ch1);
        StringBuilder str1= new StringBuilder();
        StringBuilder str2= new StringBuilder();
        for (int i = 0; i <ch1.length ; i++) {
            str1.append(ch1[i]);
        }
        for (int i = 0; i <ch2.length ; i++) {
            str2.append(ch2[i]);
        }
        String ans1= str1.toString();
        String ans2= str2.toString();
        if (ans1.equals(ans2)) return true;
        return false;

    }
    public static void main(String[] args) {
      String   str1 = "triangle";
      String  str2 = "integral";
        System.out.println(anagramcheck(str1, str2));
    }
}
