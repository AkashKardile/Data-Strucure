package Dequeue;

import java.util.Scanner;

public class DequeueList {
	
	static class queue
	{
		int data;
		
		queue next;
		
		queue prev;
		
		queue(int data)
		{
			this.data=data;
		}
	}
	
	static queue front=null;
	static queue rare=null;
	
	
	public static void enqueueatend()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		queue new_node=new queue(data);	
		if(front==null)
		{
			front=new_node;
			rare=new_node;
			
			
		}
		else
		{
			rare.next=new_node;
			new_node.prev=rare;
			rare=new_node;
			
		}
	}
	
	public static void enqueueatbegin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		queue new_node=new queue(data);	
		
		if(front==null)
		{
			front=new_node;
			
			
		}
		else
		{
			front.prev=new_node;
			new_node.next=front;
			front=new_node;
		}
	}

	public static void dequeueatbegin() {
		if(front==null)
		{
			System.out.println("Queue is underflow");
		}
		else if(front==rare)
		{
			front=null;
			rare=null;
		}
		else
		{
			
			front.next.prev=null;
			front=front.next;
		}
	}
	
	public static void dequeueatend()
	{
		if(front==null)
		{
			System.out.println("Queue is underflow");
		}
		else if(rare==front)
		{
			front=null;
			rare=null;
		}
		else
		{
			rare=rare.prev;
			rare.next.prev=null;
			rare.next=null;
			
		}
	}
	
	public static void display()
	{
		if(front==null)
		{
			System.out.println("Queue is underflow");
		}
		else
		{
			queue temp=front;
			
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Enqueue at end");
			System.out.println("2. Enqueue at begin");
			System.out.println("3. Dequeue at begin");
			System.out.println("4. Dequeue at end");
			System.out.println("5. Display");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				enqueueatend();
				break;
			case 2:
				enqueueatbegin();
				break;
			case 3:
				dequeueatbegin();
				break;
			case 4:
				dequeueatend();
				break;
			case 5:
				display();
				break;
			}
		}

	}

}
