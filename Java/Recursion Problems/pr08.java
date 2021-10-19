package RecursionProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr08 {
    public static void main(String[] args) throws IOException {
//        Reverse a String using recursion .
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        String s = br.readLine();
//        StringBuffer sb = new StringBuffer(s);
//        sb = sb.reverse();
//        System.out.println(sb.toString());

        System.out.println("Reversed String : ");
        REVERSED(s);
    }

    private static void REVERSED(String s) {
        if(s.length()==0){//base case
            return;
        }

        String rest = s.substring(1,s.length());
        REVERSED(rest);
        System.out.print(s.charAt(0));
    }
}
