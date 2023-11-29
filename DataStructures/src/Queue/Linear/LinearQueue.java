package Queue.Linear;

import java.util.Scanner;

public class LinearQueue {
	
	static int n=5;
	
	static int queue[]=new int[n];
	
	static int front=-1;
	
	static int rare=-1;
	
	public static boolean underflow()
	{
		if(front==-1 || front>rare)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static boolean overflow()
	{
		if(rare==n-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void enqueue()
	{
		if(overflow())
		{
			System.out.println("Queue is overflow");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the data");
			int data=sc.nextInt();
			if(rare==-1)
			{
				front=front+1;
				rare=rare+1;
				queue[rare]=data;
				
			}
			
			else
			{
				rare++;
				queue[rare]=data;
			}
		}
	}
	
	
	public static void dequeue()
	{
			if(underflow())
			{
				System.out.println("queue is underflow");
			}
			else
			{
				front=front+1;
			}
	}
	
	public static void display()
	{
		if(underflow())
		{
			System.out.println("queue is underflow");
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
