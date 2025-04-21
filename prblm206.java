class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class prblm206 {
    public static void main(String[] args) {
    //Self Made LinkedList to check the code
       ListNode l1 = new ListNode(1);
       ListNode l2 = new ListNode(2);
       ListNode l3 = new ListNode(3);
       ListNode l4 = new ListNode(4);
       ListNode l5 = new ListNode(5);
       ListNode head = l1;
       l1.next = l2;
       l2.next = l3;
       l3.next = l4;
       l3.next = l4;
       l4.next = l5;

       printNode(head);
       printNode(reverseList(head));
    }
    public static void printNode(ListNode head){
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
