import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingInterval {

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        Pair[] pairs = new Pair[arr.length];

        for(int i=0 ; i<arr.length ; i++){
            Pair p = new Pair(arr[i][0],arr[i][1]);
            pairs[i] = p;
        }

        Arrays.sort(pairs);

        Stack<Pair> st = new Stack<>();
        st.push(pairs[0]);

        for(int i=1 ; i<pairs.length ; i++){
            Pair p = st.peek();
            if(p.et >= pairs[i].st){
                st.pop();
                p.et = Math.max(pairs[i].et,p.et);
                st.push(p);
            }
            else{
                st.push(pairs[i]);
            }
        }

        Stack<Pair> temp = new Stack<>(); 

        while(!st.isEmpty()){
            temp.push(st.pop());
        }

        while(!temp.isEmpty()){
            Pair p = temp.pop();
            System.out.println(p.st+" "+p.et);
        }
    }

    public static class Pair implements Comparable<Pair>{
        int st;
        int et;

        Pair(int st,int et){
            this.st = st;
            this.et = et;
        }

        public int compareTo(Pair other){
            if(this.st == other.st){
                return this.et - other.et;
            }
            else{
                return this.st - other.st;
            }
        }
    }
}
