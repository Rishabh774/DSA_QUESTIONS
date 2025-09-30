package RecursionBacktracking;

import java.util.Scanner;

public class Ques4PowerNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        System.out.print("Enter a value as power :");
        int power = sc.nextInt();
        System.out.print(num+" raised to the power "+power+" is : "+power(num, power));
    }
    static int power(int num , int power){
        if (power==0) return 1;
        if (power%2==0){
            power(num,power-1);
        }
        return num*power(num, power-1);
    }
}
