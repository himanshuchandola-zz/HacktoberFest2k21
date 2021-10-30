package RecursionProblems;

public class pr17 {
    public static void main(String[] args) {
//        Pairing/Keeping Single People Problem
        System.out.println(FindPairs(4));
    }

    private static int FindPairs(int n){
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }

        return FindPairs(n-1) + FindPairs(n-2)*(n-1);
    }
}
