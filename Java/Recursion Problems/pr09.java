package RecursionProblems;

import com.company.Replace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr09 {
    public static void main(String[] args) throws IOException {
//        replace pi with 3.14 using recursion
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("Replaced String :");
//        REPLACE(s,0,1,s.length());
        REPLACE(s);
    }

    private static void REPLACE(String s) {
        if(s.length()==0){
            return;
        }

        if(s.charAt(0)=='p' && s.charAt(1)=='i'){
            System.out.print("3.14");
            REPLACE(s.substring(2));
        }else {
            System.out.print(s.charAt(0));
            REPLACE(s.substring(1));
        }
    }
    
//OTHER WAY :

//    private static void REPLACE(String s, int i, int j, int n) {
//        if(j==n){
//            System.out.println(s);
//            return;
//        }
//
//        if(s.charAt(i)=='p' && s.charAt(j)=='i'){
//            s=s.replace("pi","3.14");
//        }
//        REPLACE(s,i+1,j+1,n);
//    }


}
