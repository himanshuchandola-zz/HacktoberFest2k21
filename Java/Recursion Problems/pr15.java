package RecursionProblems;

import java.util.Scanner;

public class pr15 {
    public static void main(String[] args) {
//       1. count path from starting point to ending point
//       2. number of ways in nxm matrix to reach the target
        System.out.println(CountPath(0,3));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(NoOfWays(n,m));

    }

    private static int NoOfWays(int n, int m) {
        if(n==1 || m==1){
            return 1;
        }
        return NoOfWays(n-1,m) + NoOfWays(n,m-1);
    }

    private static int CountPath(int i, int j) {
        if(i==j){
            return 1;
        }

        if(i>j){
            return 0;
        }

        int count = 0;
        for(int k=1;k<6;k++){
            count += CountPath(i+k,j);
        }
        return count;
    }
}
