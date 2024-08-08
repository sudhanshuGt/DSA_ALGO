package LinkedList;

public class addTwoLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode head = null;

    public static void createListNode(int[] arr) {

        head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode ListNode = new ListNode(arr[i]);
            current.next = ListNode;
            current = current.next;
        }
    }

    public static void printListNode() {

        ListNode current = head;
        while (current != null) {
            System.out.print(" -> " + current.val);
            current = current.next;
        }

        System.out.println();
    }

    public static void removeNthNode(int n) {

        if (n == 1) {
            head = head.next;
            return;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            if (count == n - 1) {
                current.next = current.next.next;
            }
            current = current.next;
        }

    }

    public static ListNode removeNthFromEnd(int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;

    }

    public static void swapByKplace(int k) {
        
        if (head == null || head.next == null || k == 0) {
            return ;
        }
 
        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length += 1;
        }
 
        current.next = head; 
        System.out.println(current.val + " " + current.next.val);
        k = k % length;
        System.out.println(k + " " + length);
 
        int stepsToNewHead = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) { 
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
 
        newTail.next = null;

        head = newHead;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        createListNode(arr);
        printListNode(); 
        swapByKplace(2);
        printListNode();

    }
}
