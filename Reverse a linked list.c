

// Complete the reverse function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
SinglyLinkedListNode* reverse(SinglyLinkedListNode* head) 
{
    SinglyLinkedListNode *prevnode,*curnode;
    if(head!=NULL)
    {
        prevnode=head;
        curnode=head->next;
        head=head->next;
        prevnode->next=NULL;
        while(head!=NULL)
        {
            head=head->next;
            curnode->next=prevnode;
            prevnode=curnode;
            curnode=head;
        }
        head=prevnode;
    }
    return head;

}

