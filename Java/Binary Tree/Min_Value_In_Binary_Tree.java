public class Min_Value_In_Binary_Tree {

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
    
    public static int findMin(Node root){
        //code here
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,Math.min(findMin(root.left),findMin(root.right)));
    }
}
