package RecursionBacktracking;

public class Ques3TowerOfHanoi {
    public static void main(String[] args) {
        int n =3;
        char A,B,C;
        hanoi(n,'A','B','C');
    }
    static void hanoi(int n , char a , char b, char c){
        if (n==0) return;
        hanoi(n-1,a,c,b);
        System.out.println(a+"->"+c);
        hanoi(n-1,b,a,c);
    }
}
