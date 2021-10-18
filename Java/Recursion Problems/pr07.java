package RecursionProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        int n = Integer.parseInt(br.readLine());
        int i = 0;
        System.out.println("First Occurrence of " + n + ": " + FIRSTOCCURRENCE(n,arr,arr.length,i));
        System.out.println("Last Occurrence of " + n + ": " + LASTOCCURRENCE(n,arr,arr.length,i));
    }

    private static int LASTOCCURRENCE(int n, int[] arr, int length, int i) {
        if(i==length){
            return -1;
        }
        int restarray = LASTOCCURRENCE(n,arr,length,i+1);

        if(restarray!=-1){
            return restarray;
        }

        if(arr[i]==n){
            return i;
        }
        return -1;
    }

    private static int FIRSTOCCURRENCE(int n,int[] arr,int length,int i) {
        if(i==length){
            return -1;
        }

        if(arr[i]==n){
            return i;
        }

        return FIRSTOCCURRENCE(n,arr,length,i+1);
    }
}
