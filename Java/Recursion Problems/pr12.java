package RecursionProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr12 {

    /*Problem : Moves x to end of string using recursion*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("Modified String is : " + movX(s));
    }

    private static String movX(String s) {
        if(s.length()==0){
            return "";
        }

        char ch = s.charAt(0);
        s = s.substring(1);
        String ans = movX(s);

        if(ch=='x'){
            return ans+ch;
        }
        return ch+ans;
    }
}
