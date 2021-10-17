package RecursionProblems;

import java.util.Scanner;

public class pr04 {
    /*Problem : Fibonacci number*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any number to get n_th fibonacci number : ");
        num = sc.nextInt();
        System.out.println("Nth fibonacci number is : " + FIBONACCI(num));
    }

    static int FIBONACCI(int n){
        if(n==1)return 1;
        if(n==0)return 0;

        return FIBONACCI(n-1)+FIBONACCI(n-2);
    }
}
