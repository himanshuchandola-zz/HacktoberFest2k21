package RecursionProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr11 {

    /*Problem : Remove duplicates in string using recursion.*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("New string after removing duplicates :" + remDuplicates(s));
    }

    private static String remDuplicates(String s) {
        if(s.length()==0){
            return "";
        }
        char ch = s.charAt(0);
        if(s.length()>1) s = s.substring(1);
        String ans = remDuplicates(s);
        if(ch==ans.charAt(0)){
            return ans;
        }
        return (ch+ans);
    }
}
