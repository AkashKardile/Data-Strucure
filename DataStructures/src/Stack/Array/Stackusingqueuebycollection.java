package Stack.Array;

import java.util.Queue;
import java.util.Scanner;

public class Stackusingqueuebycollection {
	
	static int n=100;
	
	static int queue[]=new int[n];
	
	static int front=-1;
	static int rare=-1;
	
	
	public static int size()
	{
		int size=rare-front;
		
		return size;
	}
	public static void push()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		
		if(front==-1 && rare==-1)
		{
			front++;
			rare++;
			queue[rare]=data;
		}
		else
		{
			rare++;
			queue[rare]=data;
			
			int size=size();
			
			while(size>0)
			{
				rare++;
				queue[rare]=queue[front];
				front++;
				size--;
			}
		}
	}
	
	public static void pop()
	{
		if(front==-1 ||  front>rare)
		{
			System.out.println("Queue is undertflow");
		}
		else
		{
			front++;
		}
	}
	
	public static void display()
	{
		if(front==-1 ||  front>rare)
		{
			System.out.println("Queue is undertflow");
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
		// TODO Auto-generated method stub\
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
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
