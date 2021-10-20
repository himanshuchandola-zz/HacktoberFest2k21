import java.io.*;
import java.util.Stack;

public class LargestAreaHistogram {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
    
        // code        
        System.out.println(solve(a));
    }

    public static int solve(int[] arr){
        
        Stack<Integer> st = new Stack<>();
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        for(int i=0 ; i<arr.length ; i++){

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                left[i] = -1;
            }
            else{
                left[i] = st.peek();
            }
            st.push(i);
        }
        
        st = new Stack<>();
        
        for(int i=arr.length-1 ; i>=0 ; i--){

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                right[i] = arr.length;
            }
            else{
                right[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = (right[0] - left[0] - 1)*arr[0];
        for(int i=1 ; i<arr.length ; i++){
            int area = (right[i] - left[i] - 1)*arr[i];
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}
