package DynamicProgramming;

import java.util.Scanner;

public class Dp09 {
    /*Problem : Optimal game strategy*/

    static int[][] Dp = new int[(int)1e3][(int)1e3];

    private static int Solve(int[] arr, int i, int j){
        if(i==j){
            return arr[i];
        }

        if(i>j){
            return 0;
        }

        if(Dp[i][j]!=-1){
            return Dp[i][j];
        }

        int left = arr[i] + Math.min(Solve(arr,i+2,j),Solve(arr,i+1,j-1));
        int right = arr[j] + Math.min(Solve(arr,i,j-2),Solve(arr,i+1,j-1));
        return Dp[i][j] = Math.max(left,right);
    }

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

        for(int i=0;i<1e3;i++){
            for(int j=0;j<1e3;j++){
                Dp[i][j] = -1;
            }
        }
        System.out.println("Maximum amount which we can take is : " + Solve(arr,0,N-1));
    }
}
