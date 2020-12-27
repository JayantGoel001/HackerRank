

public class Solution {
    static int top=-1;
    static int front=-1;
    static int rear=-1;
    static char stack[]=new char[1000];
    static char queue[]=new char[1000];
    static void pushCharacter(char x)
    {
        if(top==999)
        {
            System.out.println("Stack overflow");
        }
        else
        {
            top++;
            stack[top]=x;
        }
    }
    static char popCharacter()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else
        {
            return stack[top--];
        }
    }
    static void enqueueCharacter(char x)
    {
        if(rear==999)
        {
            System.out.println("Queue Overflow");
        }
        else
        {
            if(front==-1&&rear==-1)
            {
                front=0;
            }
            rear++;
            queue[rear]=x;
        }
    }
    static char dequeueCharacter()
    {
        if(front==-1)
        {
            System.out.println("Queue empty");
            return 0;
        }
        return queue[front++];
    }
