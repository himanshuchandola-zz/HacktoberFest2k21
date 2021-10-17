package RecursionProblems;

import java.util.Scanner;

public class pr03 {
    /*Problem : Factorial of any number*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any number to get factorial : ");
        num = sc.nextInt();
        System.out.println("Factorial of " + num + " is : " + FACTORIAL(num));
    }

    static int FACTORIAL(int a){
        if(a==1)return 1;

        int x = FACTORIAL(a-1);
        return x*a;
    }
}
