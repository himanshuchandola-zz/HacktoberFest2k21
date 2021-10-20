public class SumOfNodes {

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

    static int sumBT(Node head){
        //Code
        if(head == null) {
            return 0;
        }
        return sumBT(head.left) + head.data + sumBT(head.right);
    }
    
}
