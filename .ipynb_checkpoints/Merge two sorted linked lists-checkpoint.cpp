SinglyLinkedListNode* mergeLists(SinglyLinkedListNode* head1, SinglyLinkedListNode* head2) {
    SinglyLinkedList *head3=new SinglyLinkedList();
    while(head1!=NULL && head2!=NULL)
    {
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
    }
    while(head1!=NULL)
    {
        head3->insert_node(head1->data);
        head1=head1->next;
    }
    while(head2!=NULL)
    {
        head3->insert_node(head2->data);
        head2=head2->next;
    }
    return head3->head;
}