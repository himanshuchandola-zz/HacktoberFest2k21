package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Dp04 {
    /*Problem : Coin Change Problem
    * ex: set = {1,2,3} ,target = 3
    * We need to calculate possible number of ways to achieve target value.
    * Has Optimal Substructure property and Overlapping Subproblem.
    * Time Complexity using Memoization :
    * Time Complexity using Tabular approach using space efficiency : O(target*m)*/
    static int[][] Dp = new int[(int)1e3+2][(int)1e3+2];
    public static void main(String[] args) {
        int[] set = {1,2,3};
        int K;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<Dp.length;i++){
            for(int j=0;j<Dp.length;j++){
                Dp[i][j] = -1;
            }
        }
        System.out.print("Enter target number :");
        K = sc.nextInt();
        System.out.println("Total number of ways to get target value is : " + CoinChange(set,K,set.length));

        //TABULATION WITH SPACE EFFICIENCY
//        int[] set = {1,2,3};
//        int K;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter target number :");
//        K = sc.nextInt();
//        int[] Dp = new int[K+1];
//        Arrays.fill(Dp,0);
//        Dp[0] = 1;
//        for(int i=0;i<set.length;i++){
//            for(int j=0;j<K+1;j++){
//                if(j-set[i]>=0){
//                    Dp[j] += Dp[j-set[i]];
//                }
//
//            }
//        }
//        System.out.println("Total number of ways to get target value is : " + Dp[K]);

    }

    private static int CoinChange(int[] set, int k,int n) {
        if(k==0)return 1;
        if(k<1)return 0;
        if(n<=0)return 0;
        if(Dp[n][k]!=-1){
            return Dp[n][k];
        }

        Dp[n][k] = CoinChange(set,k,n-1) + CoinChange(set,k-set[n-1],n);
        return Dp[n][k];
    }
}
