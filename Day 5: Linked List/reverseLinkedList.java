//Reverse a linklist with O(n) time complexity and O(1) space complexity

import java.util.* ;
import java.io.*; 
/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
        LinkedListNode<Integer> m=new LinkedListNode<Integer>(0);
        LinkedListNode<Integer> n=new LinkedListNode<Integer>(0);
        LinkedListNode<Integer> o=new LinkedListNode<Integer>(0);
        n=head;
        m=null;
        while(n!=null){
            o=n.next;
            n.next=m;
            m=n;
            n=o;
        }
        return(m);
    }
}
