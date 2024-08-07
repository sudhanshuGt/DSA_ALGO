/*package whatever //do not write package name here */

import java.io.*;

class StackImpl {
    
    public static class Node {
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    
    public static class Stack {
    
         Node head;
         
         public void push(int a){
             Node newNode = new Node(a);
             if (head == null){
                 head = newNode;
                 return;
             } else {
                newNode.next = head;
                head = newNode;
             } 
         }
         
         public int pop(){
             int a  = head.data;
             head = head.next;
             return a;
         }
         
         public int peek(){
             int a = head.data;
             return a;
         }
         
         public boolean isEmpty(){
             return head == null;
         }
        
    }
    
	public static void main (String[] args) {
		Stack st = new Stack();
		
		st.push(1);
		st.push(2);
		st.push(3);
		 
		while(!isEmpty()){
		    System.out.println(st.peek());
		}
	}
}