package RecursionProblems;

public class pr18 {
    public static void main(String[] args) {
//        KNAPSACK
        int[] values = {2, 6, 9, 4, 6, 8, 6};
        int[] w = {4,7,2,9,6,3,5};
        System.out.println(KNAPSACK(values,w,7,30));
    }

    private static int KNAPSACK(int[] values, int[] w, int n, int W) {
        if(n==0 || W==0){
            return 0;
        }

        if(w[n-1]>W){
            return KNAPSACK(values,w,n-1,W);
        }

        return Math.max(KNAPSACK(values,w,n-1,W-w[n-1])+values[n-1],KNAPSACK(values,w,n-1,W));
    }
}
