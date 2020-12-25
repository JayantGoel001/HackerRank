

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) 
    {
        SinglyLinkedListNode node=new SinglyLinkedListNode(data);
        if(llist==null)
        {
            llist=node;
            return llist;
        }
        else
        {
            node.next=llist;
            llist=node;
            return llist;
        }


    }

