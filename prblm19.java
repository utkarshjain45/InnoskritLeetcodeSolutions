public class prblm19 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        ListNode head = l1;
        ListNode afterremoval = removeNthFromEnd(head, 2);
        printList(afterremoval);
        // ListNode l1 = new ListNode(1);
        // ListNode l2 = new ListNode(2);
        // ListNode l3 = new ListNode(3);
        // ListNode l4 = new ListNode(4);
        // ListNode l5 = new ListNode(5);
        // l1.next = l2;
        // l2.next = l3;
        // l3.next = l4;
        // l4.next = l5;
        // ListNode head = l1;
        // printList(head);
        // ListNode afterremoval = removeNthFromEnd(head, 2);
        // printList(afterremoval);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int length = findLength(curr);
        if(length == 1){
            return null;
        }
        if(length == n){
            return head.next;
        }

        int count = 0;
        while(count < (length - n - 1)){
            curr = curr.next;
            count++;
        }
        curr.next = curr.next.next;
        return head;
    }

    public static int findLength(ListNode head){
        ListNode curr = head;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        return length;
    }

    public static void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
