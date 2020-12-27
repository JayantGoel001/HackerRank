void printLinkedList(SinglyLinkedListNode* head) 
{
    SinglyLinkedListNode *temp=head;
    while(temp!=NULL)
    {
        printf("%d\n",temp->data);
        temp=temp->next;
    }
}

