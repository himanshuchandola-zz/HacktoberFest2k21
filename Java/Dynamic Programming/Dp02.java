package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Dp02 {
    /*Problem : Fibonacci
    * has both optimal substructure and overlapping subproblem
    * Can be done using DP
    * Time Complexity without DP : O(2^N)
    * Time Complexity using DP : O(N)*/

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        N = sc.nextInt();
        int[] Dp = new int[N+1];//declare this globally
        Arrays.fill(Dp,-1);
        System.out.println("Fibonacci at " + N + "th index is : " + Fib(N,Dp));
    }

    private static int Fib(int n,int[] Dp) {
        if(n==0)return 0;
        if(n==1)return 1;
        if(Dp[n]!=-1)return Dp[n];
        Dp[n] = Fib(n-1,Dp) + Fib(n-2,Dp);
        return Dp[n];
    }
}
