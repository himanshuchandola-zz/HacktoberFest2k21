package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Dp08 {
    /*Problem : Minimum jumps to reach the end
    * Solving using DP
    * Time Complexity using DP : O(N^2)
    * Time Complexity using Greedy approach : O(N)*/
//Tabular Approach
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        N = sc.nextInt();
        int[] arr = new int[N];
        int[] jumps = new int[N];
        for(int i=0;i<N;i++){
            System.out.print("Enter element " + i + " :");
            arr[i] = sc.nextInt();
        }
        Arrays.fill(jumps, (int) 1e9);
        jumps[0] = 0;
        System.out.println("Minimum jumps to reach the end of array is : ");
        if(arr[0] == 0){
            System.out.print(-1);
            return;
        }
        for(int i=1;i<N;i++){
            for(int j=0;j<i;j++){
                if(i<=j+arr[j]){
                    jumps[i] = (Math.min(jumps[i],jumps[j]+1));
                }
            }
        }
        System.out.print(jumps[N-1]);
    }
}
