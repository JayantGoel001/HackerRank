 int stack[10000];
 int top=-1;
 void push(int x)
 {
     if(top==9999)
     {
         printf("Stack Overflow");
     }
     else
     {
         top++;
         stack[top]=x;
     }
 }
 int pop()
 {
     if(top==-1)
     {
         printf("Stack underflow");
         return -1;
     }
     else 
     {
         return stack[top--];
     }
 }
void reversePrint(SinglyLinkedListNode* head) 
{
    SinglyLinkedListNode *temp=head;
    while(temp!=NULL)
    {
        push(temp->data);
        temp=temp->next;
    }
    int x=top;
    while(x>=0)
    {
        printf("%d\n",pop());
        x--;
    }
}