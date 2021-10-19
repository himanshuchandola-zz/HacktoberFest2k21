public class SizeOfBinaryTree {

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
    
    public static int getSize(Node root)
	{
        //add Code here.
        if(root == null) {
            return 0;
        }
        return getSize(root.left) + 1 + getSize(root.right);
    }
}
