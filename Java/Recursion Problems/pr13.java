package RecursionProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr13 {

    /*Problem : Print all Possible subsequences*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String curr = "";
        System.out.println("All possible subsequences :");
        SUBSEQUENCES(s,0,curr);
    }

    private static void SUBSEQUENCES(String s1, int i, String s) {
        if(i==s1.length()){
            System.out.println(s);
            return;
        }
        int a = (int) s1.charAt(i);
        SUBSEQUENCES(s1,i+1,s+s1.charAt(i));
        SUBSEQUENCES(s1,i+1,s);
    }
}
