package Queue.circular;

import java.util.Scanner;

public class StackUsingqueue {
	static int n=5;
	
	static int queue[]=new int[n];
	
	static int front=-1;
	static int rare=-1;
	
static int queue1[]=new int[n];
	
	static int front1=-1;
	static int rare1=-1;
	
	public static void push()
	{
		if(rare==n-1)
		{
			System.out.println("Queue is overflow");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the data");
			
			int data=sc.nextInt();
			
			if(front==-1)
			{
				front=front+1;
				rare=rare+1;
				queue[rare]=data;
			}
			else
			{
				rare=rare+1;
				queue[rare]=data;
			}
		}
	}
	
	
	public static void push1()
	{
		if(rare1==(n-1))
		{
			System.out.println("Queue is overflow");
		}
		else
		{
			if(front1==-1)
			{
				front1=front1+1;
				rare1=rare1+1;
				queue1[rare1]=queue[rare];
				rare--;
			}
			
			while(rare!=-1)
			{
				rare1=rare1+1;
				queue1[rare1]=queue[rare];
				rare--;
			}
		}
	
	}
	
	public static void pop1()
	{
		if(front1==-1 || front1>rare1)
		{
			System.out.println("Queue is underflow");
		}
		
		else
		{
			front1++;
			while(rare1>=front1)
			{
				
				rare=rare+1;
				queue[rare]=queue1[rare1];
				rare1--;
				
				
			}
		}
		front1=-1;
		rare1=-1;
	}
	public static void pop()
	{
		if(front==-1 || front>rare)
		{
			System.out.println("Queue is underflow");
		}
		else
		{
			push1();
			pop1();
		}
	}

	public static void display()
	{
		if(front==-1 || front>rare)
		{
			System.out.println("Queue is underflow");
		}
		else
		{
			for(int i=front;i<=rare;i++)
			{
				System.out.print(queue[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch (ch) 
			{
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			
				
			}
		}

	}

}
