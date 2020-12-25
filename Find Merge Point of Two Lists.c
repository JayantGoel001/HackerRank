

// Complete the findMergeNode function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
int findMergeNode(SinglyLinkedListNode* head1, SinglyLinkedListNode* head2) 
{
    while(head1!=NULL)
    {
        SinglyLinkedListNode *temp=head2;
        while(temp!=NULL)
        {
            if(temp==head1)
            {
                return (temp->data);
            }
            temp=temp->next;
        }
        head1=head1->next;
    }
    return 0;
}

