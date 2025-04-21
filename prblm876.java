class node {
    int val;
        node next;
        node(int x) {
        val = x;
        next = null;
    }
}

public class prblm876 {

    public static void main(String[] args) {
        //Self Made LinkedList to check the code
       node l1 = new node(1);
       node l2 = new node(2);
       node l3 = new node(3);
       node l4 = new node(4);
       node l5 = new node(5);
       node head = l1;
       l1.next = l2;
       l2.next = l3;
       l3.next = l4;
       l4.next = l5;

       node ans = middleNode(head);
       while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
       }
    }

    public static node middleNode(node head) {
        node slow = head;
        node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}