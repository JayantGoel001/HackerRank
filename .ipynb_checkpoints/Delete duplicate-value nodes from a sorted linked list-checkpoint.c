SinglyLinkedListNode* removeDuplicates(SinglyLinkedListNode* head) {
    SinglyLinkedListNode *temp,*ptr;
    temp=head;
    while(temp!=NULL && temp->next!=NULL)
    {
        if(temp->data==temp->next->data)
        {
            ptr=temp->next;
            temp->next=ptr->next;
            free(ptr);
        }
        else
        {
            temp=temp->next;
        }
    }
    return head;
}

