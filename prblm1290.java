public class prblm1290 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(0);
        l1.next.next = new ListNode(1);
        System.out.println(new prblm1290().getDecimalValue2(l1));
        
        ListNode l2 = new ListNode(0);
        System.out.println(new prblm1290().getDecimalValue2(l2));
    }

    public int getDecimalValue(ListNode head) {
        ListNode node = head;
        StringBuilder str = new StringBuilder();
        while (node != null) {
            str.append(node.val);
            node = node.next;
        }
        return Integer.parseInt(str.toString(), 2);
    }

    public int getDecimalValue2(ListNode head) {
        ListNode node = head;
        int ans = 0;
        while (node != null) {
            ans = ans << 1 |node.val;
            node = node.next;
        }
        return ans;
    }
}
