

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) 
    {
        SinglyLinkedListNode node=new SinglyLinkedListNode(data);
        SinglyLinkedListNode temp=head;
        for(int i=1;i<position;i++)
        {
            temp=temp.next;
        }
        SinglyLinkedListNode temp1=temp.next;
        temp.next=node;
        node.next=temp1;
        return head;
    }

