package Stack.Array;

import java.util.Scanner;

public class Implementtwostackinanarray {
	static int n=10;
	static int arr[]=new int[n];
	static int top1=-1;
	static int top2=n;
	
	public static void push1()
	{
		
		if(top1==n/2-1)
		{
			System.out.println("Stack 1 is overflow");
			
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the data");
			int data=sc.nextInt();
			top1++;
			arr[top1]=data;
		}
	}
	
	public static void push2()
	{
		
		if(top2==n/2)
		{
			System.out.println("Stack 2 is overflow");
			
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the data");
			int data=sc.nextInt();
			top2--;
			arr[top2]=data;
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
				System.out.print(arr[i]+" ");
			}
		}
		else if(top1==-1)
		{
				System.out.println("Satck 1 is underflow");
				for(int i=top2;i<n;i++)
				{
					System.out.print(arr[i]+" ");
				}
		}
		else if(top2==n)
		{
				System.out.println("Satck 2 is underflow");
				for(int i=top1;i>=0;i--)
				{
					System.out.print(arr[i]+" ");
				}
		}
		else
		{
			for(int i=top1;i>=0;i--)
			{
				System.out.print(arr[i]+" ");
			}
			
			for(int i=top2;i<n;i++)
			{
				System.out.print(arr[i]+" ");
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
