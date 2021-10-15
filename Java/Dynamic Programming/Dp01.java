package DynamicProgramming;

import java.util.Arrays;

public class Dp01 {
    public static void main(String[] args) {
        int n = 18;
        int[] a = {7,5,1};
        int[] dp = new int[n+1];//dp approach
        Arrays.fill(dp,-1);
        dp[0] = 0;
        System.out.println(minCoin(n,a,dp));//upto this normal approach
        for(int num : dp){
            System.out.print(num + " ");
        }
    }

    static int minCoin(int k , int[] a , int[] dp){
        if (k==0) return 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(k-a[i]>=0){
                int subAns = 0;
                if(dp[k-a[i]] != -1){
                    subAns = dp[k-a[i]];
                }else{
                    subAns = minCoin(k-a[i],a,dp);
                }
                if(subAns!=ans && subAns+1<ans){
                    ans = subAns+1;
                }
            }
        }
        return dp[k]=ans;
    }
}
