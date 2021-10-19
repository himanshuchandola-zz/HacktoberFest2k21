public class RemoveAtIndex {
    
    public static class Node {
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }

    public Node removeAtIndex(Node head, int index) {

        int l = getLength(head);

        if(index < 0 || index > l) {
            return head;
        }
        else if(index == 0) {
            return removeFirst(head);
        }
        else if(index == l) {
            return removeLast(head);
        }
        else{
            Node temp = head;
            int k = 1;
            while(k < index){
                k++;
                temp = temp.next;
            }

            temp.next = temp.next.next;
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

    public Node removeFirst(Node head){
        // write your code here

        if(head == null){
            System.out.println("List is empty");
            return null;
        }
        else{
            Node temp = head;
            head = head.next;
            return temp;
        }

    }

    public Node removeLast(Node head){
        // write your code here

        if(head == null){
            System.out.println("List is empty");
            return null;
        }
        else if(head.next == null){
            return null;
        }
        else{
            Node temp = head;

            while(temp.next.next != null){
                temp = temp.next;
            }

            temp.next = null;
            return head;
        }
    }
}
