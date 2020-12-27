static boolean hasCycle(SinglyLinkedListNode head) 
{
    int i=0;
    while(i<=1000)
    {
        if(head==null)
        {
            return false;
        }
        head=head.next;
        i++;
    }
    return true;
}