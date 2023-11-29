package Queue.circular;

import java.util.Scanner;

public class QueueArray {
	static int n=5;
	static int queue[]=new int[n];
	
	static int front=-1;
	static int rare=-1;

	public static boolean overflow()
	{
		if(front==(rare+1)%n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean underflow()
	{
		if(front==-1 && rare==-1)
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		if(overflow())
		{
			System.out.println("Queue is overflow");
		}
		else if(front==-1 && rare==-1)
		{
			front=(front+1)%n;
			rare=(rare+1)%n;
			queue[rare]=data;
		}
		else
		{
			rare=(rare+1)%n;
			queue[rare]=data;
		}
	}
	
	public static void dequeue()
	{
		if(underflow())
		{
			System.out.println("Queue is underflow");
		}
		else if(front==rare)
		{
			front=-1;
			rare=-1;
		}
		else
		{
			front=(front+1)%n;
		}
	}
	
	public static void isempty()
	{
		if(underflow())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("Queue is not empty");
		}
	}
	
	public static void display()
	{
		if(underflow())
		{
			System.out.println("Queue is underflow");
		}
		else
		{
			int i=0;
			for(i=front;i!=rare;i=(i+1)%n)
			{
				System.out.print(queue[i]+" ");
			}
			System.out.print(queue[i]);
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
			System.out.println("4. Isempty");
			
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
			case 4:
				isempty();
				break;
			
			}
		}

	}

}
