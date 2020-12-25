

// Complete the deleteNode function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
SinglyLinkedListNode* deleteNode(SinglyLinkedListNode* head, int position) 
{
    SinglyLinkedListNode *prev,*temp=head;
    if(position==0)
    {
        head=head->next;
        free(temp);
    }
    else
    {
        int i=0;
        while(i!=position)
        {
            prev=temp;
            temp=temp->next;
            i++;
        }
        prev->next=temp->next;
        free(temp);
    }
    return head;
}

