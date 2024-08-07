/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    public static class Node {
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next  = null;
        }
    }
    
    public Node head;
    
    public GFG(){
        this.head = null;
    }
    
    public void addItem(int a){
        Node n = new Node(a);
        if(head == null){
            head = n;
            return;
        }else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            
            current.next = n;
        } 
    }
    
    public void removeByIndex(int i){
        if(head == null || i < 0){
            System.out.println("List is empty!");
            return;
        }
        
        if(i == 0){
            head = head.next;
            return;
        }
        Node current = head;
        for(int index = 0; index < i - 1; i++){
            if(current == null){
                 System.out.println("index out of bound");
                 return;
            }
            current = current.next;
        }
        
        if(current == null){
            System.out.println("index out of bound");
            return;
        }
        
        current.next = current.next.next;
    }
    
    public void removeByData(int a){
        while (head != null && head.data == a) {
            head = head.next;
        }

        // Current node pointer
        Node current = head;
 
        while (current != null && current.next != null) {
            if (current.next.data == a) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
   
    }
    
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        head = prev;
    }
    
    
    public void append(int i, int a){
        if(i < 0){
            return;
        }
        
        Node newNode = new Node(a);
        
        if(i == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        
         Node current = head;
         for(int index = 1; index < i - 1; index++){
            current = current.next;
        }
        
        if(current == null){
            return;
        }
        
        newNode.next = current.next;
        current.next = newNode;
      
    }
    
    public void printItem(){
        if(head == null){
            System.out.println("List is empty!");
        }
        
        Node current = head;
        while(current != null){
                System.out.print(" -> " + current.data);
                current = current.next;
        }
    }
    
	public static void main (String[] args) {
	    
	   GFG gfg = new GFG();
	   
	   gfg.addItem(4);
	   gfg.addItem(2);
	   gfg.addItem(3);
	   gfg.addItem(4);
	   gfg.addItem(5);
       gfg.addItem(4);
	   
	    
	   gfg.removeByData(4); 
	   gfg.printItem();
       gfg.reverse();
       System.out.println();
       gfg.printItem();
	   
	   
	}
}