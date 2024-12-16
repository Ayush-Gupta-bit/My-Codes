public class Deque 
{
    static int front=-1, rear=-1, deque[], size;
    public Deque(int n) 
    {
        deque=new int [n];
        size=n;
    }
    public boolean pushFront(int x) 
    {
        if((front==0 && rear==size-1) || (front==rear+1))
        return false;
        else if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
            deque[front]=x;
        }
        else if(front==0)
        {
            front=size-1;
            deque[front]=x;
        }
        else
        deque[--front]=x;
        return true;
    }
    public boolean pushRear(int x) 
    {
        if((front==0 && rear==size-1) || (front==rear+1))
        return false;
        else if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
            deque[rear]=x;
        }
        else if(rear==size-1)
        {
            rear=0;
            deque[rear]=x;
        }
        else
        deque[++rear]=x;
        return true;
    }
    public int popFront() 
    {
        if(front==-1 && rear==-1)
        return -1;
        else if(front==rear)
        {
            int x=deque[front];
            front=-1;
            rear=-1;
            return x;
        }
        else if(front==size-1)
        {
            int x=deque[front];
            front=0;
            return x;
        }
        else
        {
            int x=deque[front];
            front++;
            return x;
        }
    }
    public int popRear() 
    {
        if(front==-1 && rear==-1)
        return -1;
        else if(front==rear)
        {
            int x=deque[rear];
            front=-1;
            rear=-1;
            return x;
        }
        else if(rear==0)
        {
            int x=deque[rear];
            rear=size-1;
            return x;
        }
        else
        {
            int x=deque[rear];
            rear--;
            return x;
        }
    }
    public int getFront() 
    {
        if(front==-1)
        return -1;
        else 
        return deque[front];
    }
    public int getRear() 
    {
        if(rear==-1)
        return -1;
        else
        return deque[rear];
    }
    public boolean isEmpty() 
    {
        if(front==-1 && rear==-1)
        return true;
        else
        return false;
    }
    public boolean isFull() 
    {
        if((front==0 && rear==size-1)||(front==rear+1))
        return true;
        return false;
    }
}