public class prblm25 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printList(head);
        ListNode ans = reverseKGroupWithoutDummy(head, 2);
        printList(ans);
    }

    public static void printList(ListNode head) {
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

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode curr = head;
        
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        
        if (count < k) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevHead = dummy;

        while (count >= k) {
            ListNode currGroupStart = prevHead.next;
            ListNode currGroupEnd = prevHead.next;
            
            for (int i = 1; i < k; i++) {
                currGroupEnd = currGroupEnd.next;
            }
            
            ListNode nextGroupStart = currGroupEnd.next;
            currGroupEnd.next = null;  
            
            reverseList(currGroupStart);
            
            prevHead.next = currGroupEnd;
            currGroupStart.next = nextGroupStart;
            
            prevHead = currGroupStart;
            
            count -= k;
        }
        return dummy.next;
    }

    public static ListNode reverseKGroupWithoutDummy(ListNode head, int k) {
        int count = 0;
        ListNode curr = head;
        
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        
        if (count < k) {
            return head;
        }
        
        ListNode start = null;
        ListNode prevHead = null;
        curr = head;

        while (count >= k) {
            ListNode currGroupStart = curr;
            ListNode currGroupEnd = curr;
            
            for (int i = 1; i < k; i++) {
                currGroupEnd = currGroupEnd.next;
            }
            
            ListNode nextGroupStart = currGroupEnd.next;
            currGroupEnd.next = null;  
            
            reverseList(currGroupStart);

            if (start == null) {
                start = currGroupEnd;
            }
            if (prevHead != null) {
                prevHead.next = currGroupEnd;
            }
        
            currGroupStart.next = nextGroupStart;
            prevHead = currGroupStart;
            
            curr = nextGroupStart;
            count -= k;
        }
        return start;
    }
}