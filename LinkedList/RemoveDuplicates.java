package LinkedList;


class RemoveDuplicates {


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
    
    public static void RemoveDublicateItem(){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            while (current.next != null && current.val == current.next.val) {
                current = current.next;
            }
            if (prev.next == current) {
                prev = prev.next;
            } else {
                prev.next = current.next;
            }
            current = current.next;
        }
        head = dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 5, 6};
        createListNode(arr);
        printListNode();
        RemoveDublicateItem();
        printListNode();
    }
}