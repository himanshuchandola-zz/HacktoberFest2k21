package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Dp06 {
    /*Problem : Longest Increasing Subsequence
    * Every sub-array is a subsequence but not every subsequence is not a sub-array.
    * Has Both Optimal Substructure and Overlapping property.
    * Time Complexity : O(N^2)*/
    static int[] Dp = new int[(int)1e3+2];
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            System.out.print("Enter element " + i + " :");
            arr[i] = sc.nextInt();
        }
        Arrays.fill(Dp,-1);
        System.out.println("Longest increasing subsequence is of length " + LIS(arr,N-1));
    }

    private static int LIS(int[] arr,int n) {
        if(Dp[n]!=-1){
            return Dp[n];
        }

        Dp[n] = 1;

        for(int i=0;i<n;i++){
            if(arr[i]<arr[n]) {
                Dp[n] = Math.max(Dp[n], 1 + LIS(arr, i));
            }
        }
        return Dp[n];
    }
}
