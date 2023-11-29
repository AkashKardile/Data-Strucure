package Stack.Array;

import java.util.Scanner;

public class Twostackinanarray {
	static int n=10;
	static int stack[]=new int[n];
	static int top1=-1;
	static int top2=n;
	
	static int a=6;
	static int b=4;
	public static void push1()
	{
		Scanner sc=new Scanner(System.in);
		if(top1==a-1)
		{
			System.out.println("Stack 1 is overflow");
		}
		else
		{
			System.out.println("Enter the data");
			int data=sc.nextInt();
			
			top1++;
			stack[top1]=data;
			
		}
		
	}

	public static void push2()
	{
		Scanner sc=new Scanner(System.in);
				
		if(top2==n-b)
		{
			System.out.println("Stack 2 is overflow");
		}
		else
		{
			System.out.println("Enter the data");
			int data=sc.nextInt();
			
			top2--;
			stack[top2]=data;
			
		}
		
	}
	
	public static void pop1()
	{
		if(top1==-1)
		{
			System.out.println("Stack 1 is underflow");
		}
		else
		{
			top1--;
		}
	}
	
	public static void pop2()
	{
		if(top2==n)
		{
			System.out.println("Stack 2 is underflow");
		}
		else
		{
			top2++;
		}
	}
	
	public static void display()
	{
		if(top2==top1+1)
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(stack[i]+" ");
			}
		}
		else
		{
			if(top1==-1)
			{
				System.out.println("Stack 1  is underflow");
				for(int i=top2;i<n;i++)
				{
					System.out.print(stack[i]+" ");
				}
			}
			
			else if(top2==n)
			{
				System.out.println("Stack 2  is underflow");
				for(int i=top1;i>=0;i--)
				{
					System.out.print(stack[i]+" ");
				}
				
				
			}
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Push For stack 1");
			System.out.println("2. Push For stack 2");
			System.out.println("3. Pop For stack 1");
			System.out.println("4. Pop For stack 2");
			System.out.println("5. Display");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				push1();
				break;
			case 2:
				push2();
				break;
			case 3:
				pop1();
				break;
			case 4:
				pop2();
				break;
			case 5:
				display();
				break;
			}
		}

	}

}
