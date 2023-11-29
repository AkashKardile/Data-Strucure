package Queue.circular;

import java.util.Scanner;

public class Queueusingstack {
	
	static int n=10;
	
	static int stack[]=new int[n];
	
	
	static int top=-1;
	
	
	
	static int stack1[]=new int[n];
	static int top1=-1;
	
	public static void enqueue()
	{
		if(top==n-1)
		{
			System.out.println("Stack is overflow");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the data");
			int data=sc.nextInt();
			
				
				top++;
				stack[top]=data;
			
		}
	}
	
	public static void dequeue()
	{
		if(top==-1)
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			enqueue1();
			dequeue1();
		}
	}
	public static void enqueue1()
	{
		if(top1==n-1)
		{
			System.out.println("Stack is overflow");
		}
		else
		{
						
			while(top!=-1)
			{
				top1++;
				stack1[top1]=stack[top];
				top--;
			}
		}
	}
	public static void dequeue1()
	{
		if(top1==-1)
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			
			top1--;
			
			while(top1!=-1)
			{
				top++;
				stack[top]=stack1[top1];
				top1--;
			}
			
		}
	}
	
	
	public static void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			for(int i=0;i<=top;i++)
			{
				System.out.print(stack[i]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Display");
			
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				enqueue();
				break;
			case 2:
				dequeue();
				break;
			case 3:
				display();
				break;
			}
			
			
		}

	}

}
