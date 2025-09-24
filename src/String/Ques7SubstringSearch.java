package String;

public class Ques7SubstringSearch {
    static  int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String str1="hello";
        String str2= "llo";
        System.out.println(strStr(str1,str2));
    }
}
