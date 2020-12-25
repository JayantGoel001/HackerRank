/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    int i=0;
    while(i<=100)
    {
        if(head==null)
        {
            //System.out.println(head.data);
            return false;
        }
        head=head.next;
        i++;
    }
    return true;
}