package RecursionProblems;

import java.util.Scanner;

public class pr02 {
    /*Problem : Calculate a raised to power b using recursion*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter base number and power number :");
        a = sc.nextInt();
        b = sc.nextInt();
        int res = FASTPOWER(a,b);
        System.out.println("Result is : " + res);
    }

    static int FASTPOWER(int a, int b){
        if(b==0){
            return 1;
        }

        int x = FASTPOWER(a,b-1);
        return x*a;
    }
}
