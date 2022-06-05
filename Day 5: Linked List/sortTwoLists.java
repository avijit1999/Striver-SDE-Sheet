import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        if(first==null)
        {
            return(second);
        }
        else if(second==null)
        {
            return(first);
        }
        LinkedListNode<Integer> n=new LinkedListNode<Integer>(0);
        if(first.data<second.data)
        {
            n=sortTwoLists(first.next,second);
            first.next=n;
            n=first;
        }
        else{
            n=sortTwoLists(first,second.next);
            second.next=n;
            n=second;
        }
        return(n);
	}
}
