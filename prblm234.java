import java.util.*;

public class prblm234 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode head = l1;
        printList(head);
        System.out.println(isPalindromeUsingString(head));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        Stack<Integer> stack = new Stack<>();
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            if (curr.val != stack.pop()) {
                return false;
            }
            curr = curr.next;   
        }
        return true;
    }

    public static boolean isPalindromeUsingString(ListNode head) {
        ListNode curr = head;
        StringBuilder str = new StringBuilder();
        while (curr != null) {
            str.append(curr.val);
            curr = curr.next;
        }
        return str.toString().equals(str.reverse().toString());
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
