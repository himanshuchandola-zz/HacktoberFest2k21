import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SlidingWindowMaximum {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
    
        // code
        // int[] res = getMax(a,k);

        // for(int i=0 ; i<res.length ; i++){
        //     System.out.println(res[i]);
        // }
    
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        
        for(int i=n-1 ; i>=0 ; i--)
        {
            while(!s.empty() &&  a[i] > a[s.peek()])
            {
                s.pop();
            }
            
            if(s.empty())
            {
                ans[i] = n;
            }
            else
            {
                ans[i] = s.peek();
            }
            s.push(i);
        }
        
        
        for(int i=0 ; i<=n-k ; i++)
        {
            int j = i;
            
            while(ans[j] < i+k)
            {
                j = ans[j];
            }
            
            System.out.println(a[j]);
            
        }
    
    }

    //  public static int[] getMax(int[] arr,int k){

    //     int[] temp = new int[arr.length];
    //     int[] res = new int[arr.length];

    //     temp = nextGreatestElementToRight(arr);

    //     for(int i=0 ; i<=arr.length-k ; i++){
    //         int max = arr[i];
    //         int j=i;
    //         while(temp[j] < i+k){
    //             max = arr[temp[j]];
    //             j = temp[j];
    //         }
    //         res[i] = max;
    //     }
    //     return res;
    //  }


    //  public static int[] nextGreatestElementToRight(int[] arr){
    //     // solve
    //     int[] res = new int[arr.length];
    //     Stack<Integer> st = new Stack<>();
        
    //     for(int i=arr.length-1 ; i>=0 ; i--){

    //         while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
    //             st.pop();
    //         }

    //         if(st.isEmpty()){
    //             res[i] = arr.length;
    //         }
    //         else{
    //             res[i] = st.peek();
    //         }
    //         st.push(i);
    //     }
    
    // return res;
    // }
}
