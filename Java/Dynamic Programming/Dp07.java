package DynamicProgramming;

import java.util.Scanner;

public class Dp07 {
    /*Problem : Longest Common Subsequence
    * Follows Optimum Substructure and Overlapping Subproblem
    * Time Complexity : O(M*N)*/

    static int[][] Dp = new int[(int)(1e3+2)][(int)(1e3+2)];

    public static void main(String[] args) {
        System.out.println("Enter two strings");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        int m = x.length();
        int n = y.length();

        for(int i=0;i<1e3+2;i++){
            for(int j=0;j<1e3+2;j++){
                Dp[i][j] = -1;
            }
        }

        System.out.println("Length of longest common substring is : " + LCS(x,y,m,n));
    }

    private static int LCS(String x, String y, int m, int n) {
        if(m==0 || n==0){
            return 0;
        }
        if(Dp[m][n]!=-1){
            return Dp[m][n];
        }

        if(x.charAt(m-1)==y.charAt(n-1)){
            Dp[m][n] = 1+LCS(x,y,m-1,n-1);
        }else{
            Dp[m][n] = Math.max(LCS(x,y,m,n-1),LCS(x,y,m-1,n));
        }
        return Dp[m][n];
    }
}
