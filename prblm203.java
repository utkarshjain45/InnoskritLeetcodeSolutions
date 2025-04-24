class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class prblm203 {
    public static void main(String[] args) {
       ListNode l1 = new ListNode(1);
       ListNode l2 = new ListNode(2);
       ListNode l3 = new ListNode(6);
       ListNode l4 = new ListNode(3);
       ListNode l5 = new ListNode(4);
       ListNode l6 = new ListNode(5);
       ListNode l7 = new ListNode(6);
       ListNode head1 = l1;
       l1.next = l2;
       l2.next = l3;
       l3.next = l4;
       l4.next = l5;
       l5.next = l6;
       l6.next = l7;

       printNode(head1);
       ListNode newHead = removeElements(head1, 6);
       printNode(newHead);
    }
    public static void printNode(ListNode node){
        ListNode curr = node;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode newNode = new ListNode(0);
        newNode.next = head;

        ListNode curr = newNode;
        while (curr.next != null) {
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return newNode.next;
    }
}
