package Stack.Array;

import java.util.Scanner;

public class StackUsingqueues {
	
	static int n=100;
	
	static int queue1[]=new int[n];
	
	static int front1=-1;
	
	static int rare1=-1;
	
	static int queue2[]=new int[n];
	
	static int front2=-1;
	
	static int rare2=-1;
	
	
	public static void push()
	
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		if(front1==-1)
		{
			front1++;
			rare1++;
			
			queue1[rare1]=data;
		}
		else
		{
			push2();
			rare1++;
			queue1[rare1]=data;
			pop2();
		}
		
	}
	
	public static void push2()
	{
		if(front2==-1)
		{
			front2++;
			rare2++;
			queue2[rare2]=queue1[front1];
			front1++;
		}
		else
		{
			while(front1<=rare1)
			{
				rare2++;
				queue2[rare2]=queue1[front1];
				front1++;
			}
		}
	}
	
	public static void pop2()
	{
		while(front2<=rare2)
		{
			rare1++;
			queue1[rare1]=queue2[front2];
			front2++;
		}
	}
	
	public static void pop()
	{
		if(front1==-1 || front1>rare1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			front1++;
		}
			
	}
	
	public static void display()
	{
		if(front1==-1 || front1>rare1)
		{
			System.out.println("Queue is underflow");
		}
		else
		{
			for(int i=front1;i<=rare1;i++)
			{
				System.out.print(queue1[i]+" ");
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
