package RecursionProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr14 {
    public static void main(String[] args) throws IOException {
//        Possible Permutations : *******
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("All possible permutations :");
        PERMUTATIONS(s,0,s.length());
    }

    private static void PERMUTATIONS(String s, int l, int r) {
        if(l==r){
            System.out.println(s);
            return;
        }

        for(int i=l;i<r;i++){
            s = SWAP(s,i,l);
            PERMUTATIONS(s,l+1,r);
            s = SWAP(s,i,l);
        }
    }
// use char array method to swap
    private static String SWAP(String s, int l, int r) {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[l] ;
        charArray[l] = charArray[r];
        charArray[r] = temp;
        return String.valueOf(charArray);
    }
}
