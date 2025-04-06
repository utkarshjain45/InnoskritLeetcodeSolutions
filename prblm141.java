class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

public class prblm141 {

    public static void main(String[] args) {
        //Self Made LinkedList to check the code
       ListNode l1 = new ListNode(3);
       ListNode l2 = new ListNode(2);
       ListNode l3 = new ListNode(0);
       ListNode l4 = new ListNode(-4);
       ListNode head = l1;
       l1.next = l2;
       l2.next = l3;
       l3.next = l4;
       l4.next = l2;

       System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        //unoptimized code(using Hashmap)

        // Map<ListNode, Boolean> map = new HashMap<>();
        // ListNode curr = head;
        // while (curr != null) {
        //     if(map.containsKey(curr)){
        //         return true;
        //     }
        //     else{
        //         map.put(curr, true);
        //         curr = curr.next;
        //     }
        // }
        // return false;

        //Optimized code(using fast and slow pointers)
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
