

// Complete the mergeLists function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
SinglyLinkedListNode* mergeLists(SinglyLinkedListNode* head1, SinglyLinkedListNode* head2) {
    //printf("x=%d",head1->data);
    SinglyLinkedList *head3=new SinglyLinkedList();
    while(head1!=NULL && head2!=NULL)
    {
        //head3=(SinglyLinkedListNode*)malloc(sizeof(SinglyLinkedListNode));
        if(head1->data>head2->data)
        {
            head3->insert_node(head2->data);
            head2=head2->next;
        }
        else
        {
            head3->insert_node(head1->data);
            head1=head1->next;
        }
        //head3=head3->next;
    }
    while(head1!=NULL)
    {
        //head3=(SinglyLinkedListNode*)malloc(sizeof(SinglyLinkedListNode));
        head3->insert_node(head1->data);
        //head3=head3->next;
        head1=head1->next;
    }
    while(head2!=NULL)
    {
        //head3=(SinglyLinkedListNode*)malloc(sizeof(SinglyLinkedListNode));
        head3->insert_node(head2->data);
        //head3=head3->next;
        head2=head2->next;
    }
    //head3->next=NULL;
    return head3->head;
}

