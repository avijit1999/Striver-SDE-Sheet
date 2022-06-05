//Middle of Link List

import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class Solution {
    public static Node findMiddle(Node head) 
    {
        // Write your code here
        Node s=new Node(0);
        Node f=new Node(0);
        s=head;
        f=head;
        while(f.next!=null)
        {
            s=s.next;
            f=f.next;
            if(f.next!=null)
            {
                f=f.next;
            }
            else{
                return(s);
            }
        }
        return(s);
    }
}
