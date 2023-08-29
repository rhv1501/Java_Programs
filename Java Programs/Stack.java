import java.util.*;
class Stack
{
    int top,max=5;
    int arr[]=new int[5];
    Stack()
    {
     top=-1;
    }
    void push(Scanner sc)
    {
        if(top==max-1)
        {
            System.out.println("Stack overflow");
        }
        else
        {
            System.out.println("enter the valuen to be pushed");
            int val=sc.nextInt();
            top++;
            arr[top]=val;
            System.out.println("the value"+arr[top]+"is pushed");
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack underflow");
        }
        else
        {
         System.out.println("the element"+arr[top]+"is poped");
         top--;        
        }
    }
    void display()
    {
        System.out.println("elements in the stack");
        System.out.println();
        for(int i=top;i>=top;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
        int choice=0;
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        System.out.println("Stack implementtation");
        do{
            System.out.println("enter your choice");
            choice=sc.nextInt();
            switch(choice)
            {
             case 1:
             {
              s.push(sc);
              break;
             }
             case 2:
             {
                s.pop();
                break;
             }
             case 3:
             { 
                s.display();
                break;
             }
             case 4:
             {
                System.out.println("BYE BYE");
                System.exit(0);
                break;
             }
             default :
             {
              System.out.println("invalid input");
             }
            }
        }
        while(choice!=4);
    }
}
