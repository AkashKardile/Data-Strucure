package Stack.Array;

import java.util.Scanner;

public class deletethemiddleelement {
	
	static int n=6;
	
	static int stack[]=new int[n];
	static int stack1[];
	static int top=-1;
	static int top1=-1;
	public static void push()
	{
		if(top==n-1)
		{
			System.out.println("statck is overflow");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<n;i++)
			{
				top++;
				stack[top]=sc.nextInt();
			}
			
		}
	}
	
	public static void pop()
	{
		if(n%2!=0)
		{
			stack1=new int[n-1];
			
			for(int i=top;i>=0;i--)
			{
				if(i==n/2)
				{
					continue;
				}
				else
				{
					top1++;
					stack1[top1]=stack[i];
					
				}
			}
		}
		else
		{
			stack1=new int[n-2];
			
			for(int i=top;i>=0;i--)
			{
				if(i==(n/2)-1 || i==n/2)
				{
					continue;
				}
				else
				{
					top1++;
					stack1[top1]=stack[i];
					
				}
			}
			
			
		}
	}
	
	public static void findthemiddleelement()
	{
		if(n%2!=0)
		{
			for(int i=top;i>=0;i--)
			{
				if(i==n/2)
				{
					System.out.print(stack[i]);
				}
			}
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				if(i==n/2 || i==n/2-1)
				{
					System.out.print(stack[i]);
				}
			}
		}
	}
	
	public static void display()
	{
		if(n%2!=0)
		{
			n=n-1;
			
			
		}
		else
		{
			n=n-2;
		}
		
		stack=new int[n];
		top=-1;
		for(int i=top1;i>=0;i--)
		{
			top++;
			stack[top]=stack1[i];
			
			
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
			System.out.println("3. Display");
			System.out.println("4. Find the middle element");
			
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
			case 4:
				findthemiddleelement();
				break;
			}
		}

	}

}
