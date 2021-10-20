public class Max_Value_In_Binary_Tree {

    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
 
    public static int findMax(Node root){
        //code here
        
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(findMax(root.left),findMax(root.right)));
    }
}
