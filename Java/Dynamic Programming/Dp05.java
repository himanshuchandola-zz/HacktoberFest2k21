package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Dp05 {
    /*Problem : 0-1 Knapsack
    * Follows Optimal Substructure and Overlapping subproblem
    * Time Complexity using Brute force : O(2^N)
    * Time Complexity using Brute force : O(N*W)*/
    static int[] Weight = new int[(int)1e3+2];
    static int[] Val = new int[(int)1e3+2];
    static int[][] Dp = new int[(int)1e3+2][(int)1e3+2];
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of values :");
        N = sc.nextInt();
        for(int i=0;i<N;i++){
            Weight[i] = sc.nextInt();
            Val[i] = sc.nextInt();
        }

        int W = sc.nextInt();

        for(int i=0;i<1e3+2;i++){
            for(int j=0;j<1e3+2;j++){
                Dp[i][j] = -1;
            }
        }

        System.out.println("The maximum value which can be taken is : " + KnapSack(N,W));

    }

    private static int KnapSack(int n, int w) {
        if(w<=0)return 0;
        if(n<=0)return 0;

        if(Dp[n][w]!=-1){
            return Dp[n][w];
        }
        if(Weight[n-1]>w){
            Dp[n][w] = KnapSack(n-1,w);
        }else {
            Dp[n][w] = Math.max(KnapSack(n - 1, w), (KnapSack(n - 1, w - Weight[n - 1]) + Val[n - 1]));
        }
        return Dp[n][w];
    }
}
