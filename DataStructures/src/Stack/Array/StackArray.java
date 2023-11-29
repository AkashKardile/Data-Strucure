package Stack.Array;

import java.util.Scanner;

public class StackArray {
	static int n=5;
	
	static int stack[]=new int[n];
	
	static int top=-1;
	
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
	
	
	static int new_stack[]=new int[n];
	static int top1=-1;
	public static void sorting()
	{
			while(top!=-1)
			{
				
						int temp=stack[top];
						top--;
						
						while(top1!=-1  && new_stack[top1]>temp)
						{
							top++;
							stack[top]=new_stack[top1];
							top1--;
						}
						
						top1++;
						new_stack[top1]=temp;
						
				}
			
		}
	public static void display()
	{
		while(top1!=-1)
		{
			top++;
			stack[top]=new_stack[top1];
			top1--;
		}
		for(int i=top;i>=0;i--)
		{
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Push");
			System.out.println("2. pop");
			System.out.println("3. Sorting");
			System.out.println("4. Display");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				for(int i=0;i<n;i++)
				{
					push();
				}
				break;
			case 2:
				pop();
				break;
			case 3:
				sorting();
				break;
			case 4:
				display();
				break;
			}
		}

	}

}
