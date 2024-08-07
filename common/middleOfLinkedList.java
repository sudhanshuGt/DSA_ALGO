import java.util.ArrayList;

public class middleOfLinkedList {


    public static class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val){
            this.val = val;
            this.next= null;
        }
    }


    public static ListNode head = null;

    public static void createListNode(int[] arr){

        head = new ListNode(arr[0]); 
        ListNode current = head;
    
        for (int i = 1; i < arr.length; i++) {
            ListNode ListNode = new ListNode(arr[i]);
            current.next = ListNode;
            current = current.next;
        }
    }


    public static void printListNode(ListNode head){

        ListNode current = head;
        while (current != null) {
            System.out.print(" -> " + current.val);
            current = current.next;
        }

        System.out.println();
    }


    public static ListNode findMidOfList(){
        int mid = -1;
        ListNode midNode = null;
        ArrayList<Integer> list = new ArrayList<>();

        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        mid  = list.size() / 2;

        ListNode newCurrent = head;
        int currentIdx = -1;
        while (newCurrent != null) {
            currentIdx++;
            if(currentIdx == mid){
                midNode = newCurrent;
            }
            newCurrent = newCurrent.next;
        }

        return midNode;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        createListNode(arr);
        printListNode(head);
        printListNode(findMidOfList());
    }
    
}
