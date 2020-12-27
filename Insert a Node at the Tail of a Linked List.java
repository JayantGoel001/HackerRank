

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data)
    {
        SinglyLinkedListNode node=new SinglyLinkedListNode(data);
        if(head==null)
        {
            head=node;
            return head;
        }
        else
        {
            SinglyLinkedListNode temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
            node=temp;
            return head;
        }


    }

