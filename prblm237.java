class node {
    int val;
        node next;
        node(int x) {
        val = x;
        next = null;
    }
}

public class prblm237 {
    public static void main(String[] args) {
        //Self Made LinkedList to check the code
       node l1 = new node(4);
       node l2 = new node(5);
       node l3 = new node(1);
       node l4 = new node(9);
       node head = l1;
       node node = l2;
       l1.next = l2;
       l2.next = l3;
       l3.next = l4;

       printNode(head);
       deleteNode(node);
       printNode(head);
    }
    public static void deleteNode(node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static void printNode(node head){
        node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
