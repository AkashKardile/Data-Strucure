package PriorityQueue;

import java.awt.DisplayMode;
import java.util.Scanner;

public class queueList {
	
	static class queue
	{
		int data;
		
		int priority;
		
		queue next;
		
		queue(int data,int priority)
		{
			this.data=data;
			this.priority=priority;
		}
		queue(int data)
		{
			this.data=data;
		}
	}
	
	static queue front=null;
	
	
	public static void enqueue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		System.out.println("Enter the priority");
		int priority=sc.nextInt();
		
		queue new_queue=new queue(data,priority);
		
		if(front==null)
		{
			front=new_queue;
			
		}
		else if(front.priority<new_queue.priority)
		{
			new_queue.next=front;
			front=new_queue;
		}
		else
		{
			queue temp=front;
			
			
			while(temp.next!=null && temp.next.priority>new_queue.priority)
			{
				temp=temp.next;
			}
			
			
			new_queue.next=temp.next;
			temp.next=new_queue;
		}
		
	}
	
	public static void enqueue1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
	
		
		queue new_queue=new queue(data);
		
		if(front==null)
		{
			front=new_queue;
			
		}
		else if(front.data<new_queue.data)
		{
			new_queue.next=front;
			front=new_queue;
		}
		else
		{
			queue temp=front;
			
			
			while(temp.next!=null && temp.next.data>new_queue.data)
			{
				temp=temp.next;
			}
			
			
			new_queue.next=temp.next;
			temp.next=new_queue;
		}
		
	}
	public static void dequeue()
	{
		if(front==null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			front=front.next;
		}
	}
	public static void display()
	{
		if(front==null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			queue temp=front;
			
			while(temp!=null)
			{
				System.out.print(temp.data+"|"+temp.priority+" || ");
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
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Enqueue by data");
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
				enqueue1();
				break;
			case 4:
				display();
				break;
				
			}
		}

	}

}
