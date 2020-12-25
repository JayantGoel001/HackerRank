

    public static  Node insert(Node head,int data)
   {
    //Complete this method
    if(head == null)
        return new Node( data);
    else if(head.next == null)
    {
            head.next = new Node(data);
    }
    else
    {
        insert(head.next,data);
    }
        return head;
    }

