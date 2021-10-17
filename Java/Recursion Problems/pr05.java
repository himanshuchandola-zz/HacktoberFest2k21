package RecursionProblems;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class pr05 {
    /*Problem : Checking if Array is sorted or not*/
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter your array :");
        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        for(int i=0;i<s.length;i++){
           arr[i] = Integer.parseInt(s[i]);
        }

        System.out.println("Sorted status : " + isSorted(arr,arr.length));
    }

    static boolean isSorted(int[] arr, int n){
        if(n==1)return true;
        int[] slice = Arrays.copyOfRange(arr, 1, n);
        return (arr[0]<=arr[1] && isSorted(slice,n-1));
    }
}
