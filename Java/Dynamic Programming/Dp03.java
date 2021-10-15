package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Dp03 {
    /*Problem : Minimum number of squares
    * ex : 26 = 5^2 + 1^2
    * Follows Optimal Substructure and Overlapping subproblem.
    * f(x) = min(f(x-i*i)+1).... i varies from 1 to sqrt(x)
    * */
    static int[] Dp = new int[(int) (1e5+2)];
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        N = sc.nextInt();
        Arrays.fill(Dp, (int) (1e9+7));
        System.out.println("Minimum numbers of squares required is : " + MinSq(N));

        //Tabulation Approach

        /*int[] Dp = new int[n+1]
        * Dp[0]=0;
        * Dp[1]=1;
        * Dp[2]=2;
        * Dp[3]=3;
        *
        * for(int i=1;i*i<=n;i++){
        *   for(int j=0;i*i+j<=n;j++){
        *       Dp[i*i+j]=Math.min(Dp[i*i+j],1+Dp[j]);
        *   }
        * }
        *
        * System.out.println("Minimum numbers of squares required is : " + Dp[n])*/
    }

    private static int MinSq(int n) {
        if(n==0 || n==1 || n==2 || n==3){
            return n;
        }

        if(Dp[n]!=1e9+7){
            return Dp[n];
        }

        for(int i=1;i*i<=n;i++){
            Dp[n] = Math.min(Dp[n],1+MinSq(n-i*i));
        }
        return Dp[n];
    }
}
