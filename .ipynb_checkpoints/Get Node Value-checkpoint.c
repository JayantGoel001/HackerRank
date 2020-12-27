int getNode(SinglyLinkedListNode* head, int positionFromTail)
{
    if(head!=NULL)
    {
        SinglyLinkedListNode *prenode,*curnode;
        prenode=head;
        head=head->next;
        curnode=head;
        prenode->next=NULL;
        while(head!=NULL)
        {
            head=head->next;
            curnode->next=prenode;
            prenode=curnode;
            curnode=head;
        }
        head=prenode;
    }
    SinglyLinkedListNode *temp=head;
    for(int i=0;i<positionFromTail;i++)
    {
        temp=temp->next;
    }
    return temp->data;
}

