boolean hasCycle(Node head) {
    int i=0;
    while(i<=100)
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