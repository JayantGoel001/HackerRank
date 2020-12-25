

    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) 
    {
        SinglyLinkedListNode temp1,temp2;
        temp1=head1;
        temp2=head2;
        int len1=0,len2=0;
        while(temp1!=null)
        {
            temp1=temp1.next;
            len1++;
        }
        while(temp2!=null)
        {
            temp2=temp2.next;
            len2++;
        }
        if(len1!=len2)
        {
            return false;
        }
        temp1=head1;
        temp2=head2;
        while(temp1!=null)
        {
            if(temp1.data!=temp2.data)
            {
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }

