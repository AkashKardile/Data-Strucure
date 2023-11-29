package Queue.Linear;

import java.util.Scanner;

public class QueueLInkedList {
	static class queue
	{
		int data;
		
		queue next;
		
		queue(int data)
		{
			this.data=data;
		}
	}
	
	static queue front=null;
	static queue rare=null;
	
	public static boolean isunderflow()
	{
		if(front==null)
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
		
		queue new_queue=new queue(data);
		if(front==null)
		{
			front=new_queue;
			rare=new_queue;
		}
		else
		{
			rare.next=new_queue;
			rare=new_queue;
		}
	}
	
	public static void dequeue()
	{
		if(isunderflow())
		{
			System.out.println("Queue is underflow");
		}
		else
		{
			front=front.next;
		}
	}
	
	public static void isempty()
	{
		if(isunderflow())
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
		if(isunderflow())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			queue temp=front;
			
			while(temp!=rare)
			{
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.print(temp.data);
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
			System.out.println("3. Is Empty");
			System.out.println("4. Display");
			
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
				isempty();
				break;
			case 4:
				display();
				break;
			}
			
			
		}

	}

}
