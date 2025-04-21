class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

public class prblm2 {
    public static void main(String[] args) {
        //Self Made LinkedList to check the code
       ListNode l11 = new ListNode(9);
       ListNode l12 = new ListNode(9);
       ListNode l13 = new ListNode(9);
       ListNode l14 = new ListNode(9);
       ListNode l15 = new ListNode(9);
       ListNode l16 = new ListNode(9);
       ListNode l17 = new ListNode(9);
       ListNode l1 = l11;
       l11.next = l12;
       l12.next = l13;
       l13.next = l14;
       l14.next = l15;
       l15.next = l16;
       l16.next = l17;
        //Self Made LinkedList to check the code
       ListNode l21 = new ListNode(9);
       ListNode l22 = new ListNode(9);
       ListNode l23 = new ListNode(9);
       ListNode l24 = new ListNode(9);
       ListNode l2 = l21;
       l21.next = l22;
       l22.next = l23;
       l23.next = l24;
        printNode(l1);
        printNode(l2);

        printNode(addTwoNumbers(l1, l2));

    }
    public static void printNode(ListNode head){
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

        static ListNode head = null;
        static ListNode end = null;
    public static void insertNode(int val){
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
        } else{
            end.next = node;
        }
        end = node;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int carry = 0;

        while (curr1 != null && curr2 != null) {
            int sum = curr1.val + curr2.val + carry;
            carry = sum / 10;
            int val = sum % 10;
            insertNode(val);
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        while (curr1 != null) {
            int sum = curr1.val + carry;
            carry = sum / 10;
            int val = sum % 10;
            insertNode(val);
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            int sum = curr2.val + carry;
            carry = sum / 10;
            int val = sum % 10;
            insertNode(val);
            curr2 = curr2.next;
        }
        if (carry == 1) {
            insertNode(carry);
        }
        return head;
    }
}
