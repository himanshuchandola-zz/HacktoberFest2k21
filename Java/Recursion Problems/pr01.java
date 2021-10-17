package RecursionProblems;

import java.util.Scanner;

public class pr01 {
    /*Problem : Sum of n Natural numbers using recursion*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any natural number : ");
        num = sc.nextInt();
        System.out.println("Sum is : "+ SUM(num));
    }

    static int SUM(int n){
        if(n==0){
            return 0;
        }
        int prevSum = SUM(n-1);
        return n+prevSum;
    }
}
