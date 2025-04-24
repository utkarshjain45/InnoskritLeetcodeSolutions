class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class prblm21 {
    public static void main(String[] args) {
    //Self Made LinkedList to check the code
       ListNode l11 = new ListNode(1);
       ListNode l12 = new ListNode(2);
       ListNode l13 = new ListNode(4);
       ListNode head1 = l11;
       l11.next = l12;
       l12.next = l13;
       ListNode l21 = new ListNode(1);
       ListNode l22 = new ListNode(3);
       ListNode l23 = new ListNode(4);
       ListNode head2 = l21;
       l21.next = l22;
       l22.next = l23;
        printNode(head1);
        printNode(head2);
        printNode(mergeTwoLists(head1, head2));
    }
    public static void printNode(ListNode head){
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1; 
        ListNode curr2 = list2;  
        ListNode list3 = null;  

        if(curr1 == null){
            return curr2;
        }
        if(curr2 == null){
            return curr1;
        }
        
        while (curr1 != null && curr2 != null) {
            if(curr1.val == curr2.val){
                list3 = addNode(list3,curr1.val);
                list3 = addNode(list3,curr2.val);
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            else if (curr1.val < curr2.val) {
                list3 = addNode(list3,curr1.val);
                curr1 = curr1.next;
            }
            else if (curr1.val > curr2.val) {
                list3 = addNode(list3,curr2.val);
                curr2 = curr2.next;
            }
        }
            while (curr1 != null) {
                list3 = addNode(list3, curr1.val);
                curr1 = curr1.next;
            }
            while (curr2 != null) {
                list3 = addNode(list3, curr2.val);
                curr2 = curr2.next;
            }
        return list3;
    }

    public static ListNode addNode(ListNode list3, int val){
        ListNode node = new ListNode(val);
        if(list3 == null){
            list3 = node;
        }
        else{
            ListNode ptr = list3;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = node;
        }
        return list3;
    }
}
