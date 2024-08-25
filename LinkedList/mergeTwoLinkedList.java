import java.util.List;

public class mergeTwoLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode head = null;

    public static ListNode head2 = null;

    public static ListNode createListNode(ListNode head , int[] arr) {

        head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode ListNode = new ListNode(arr[i]);
            current.next = ListNode;
            current = current.next;
        }

        return head;
    }

    public static void printListNode(ListNode head) {

        ListNode current = head;
        while (current != null) {
            System.out.print(" -> " + current.val);
            current = current.next;
        }

        System.out.println();
    }

    public static ListNode mergeTwoList(){

         
        if (head == null) return head2;
        if (head2 == null) return head;

        ListNode dummy = new ListNode(0);  
        ListNode current = dummy;

        ListNode l1 = head;
        ListNode l2 = head2;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
 
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;  
   


    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3, 5};
        int[] arr2 = {1, 1, 3, 4, 5, 6, 6};


        head =  createListNode(head, arr1);
        head2 = createListNode(head2, arr2);
         
        printListNode(head);
        printListNode(head2);
 
        
        printListNode(mergeTwoList());
        
    }
}
