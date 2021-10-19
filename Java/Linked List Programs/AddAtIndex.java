public class AddAtIndex {
 
    public static class Node {
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }

    public Node addAtIndex(Node head, int index,int val) {

        int l = getLength(head);

        if(index < 0 || index > l) {
            return head;
        }
        else if(index == 0) {
            return addFirst(head, val);
        }
        else if(index == l) {
            return addLast(head, val);
        }
        else{
            Node temp = head;
            int k = 1;
            while(k < index){
                k++;
                temp = temp.next;
            }

            Node n = new Node(val);
            n.next = temp.next;
            temp.next = n;
            return head;
        }
    }

    public int getLength(Node head) {

        Node temp = head;
        int i = 0;

        while(temp != null){
            i++;
            temp = temp.next;
        }
        return i;
    }

    public Node addFirst(Node head,int val) {

        Node n = new Node(val);

        if(head == null){
            head = n;
        }
        else{
            n.next = head;
            head = n;
        }
        return head;
    }

    public Node addLast(Node head,int val) {

        Node n = new Node(val);
        
        if(head == null){
            head = n;
        }
        else{
            Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
        }
        return head;
    }
}
