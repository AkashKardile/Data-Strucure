package Stack.Array;

import java.util.Scanner;

public class Minimumelementinstack {
static int n=5;
	
	static int stack[]=new int[n];
	
	static int top=-1;
	static int stack1[]=new int[n];
	
	static int top1=-1;
	public static void push()
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
	
	public static void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			top--;
		}
	}
	
	static int a;
	public static void getminimum()
	{
			a=top;
			
			if(a==-1)
			{
				System.out.println("Stack is underflow");
			}
			else
			{
				top1++;
				stack1[top1]=stack[a];
				
				
				a--;
				while(a!=-1)
				{
					int temp=stack[a];
					a--;
					
					if(stack1[top1]>temp)
					{
						stack1[top1]=temp;
					}
				}
				System.out.println("Minimum element is: "+stack1[top1]);
			}
				top1--;
		}
	
	public static void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.print(stack[i]+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. GetMinimum");
			System.out.println("4. Display");
			
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
				getminimum();
				break;
			case 4:
				display();
				break;
			}
		}

	}

}
