package RecursionProblems;

public class pr16 {
    public static void main(String[] args) {
//        n tiles problem - similar to fibonacci
//        2xn board and 2x1 tile
        System.out.println(nTiles(4));
    }

    private static int nTiles(int n){
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        return nTiles(n-1) + nTiles(n-2);
    }
}
