package Stack.Array;

import java.util.Scanner;

public class Mininstackbyencryptanddecrypt {
	static int n=7;
	static int stack[]=new int[n];
	static int top=-1;
	static int min=Integer.MAX_VALUE;
	
	public static void push()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the data");
		int data=sc.nextInt();
		
		
		if(top==-1)
		{
			top++;
			stack[top]=data;
			min=data;
		}
		else
		{
			int x=data;
			if(x<min)
			{
				
				x=2*data-min;
				min=data;
			}
			top++;
			stack[top]=x;
		}
		
	}
	
	public static void pop()
	{
		if(top==-1)
		{
			System.out.println("Satck is empty");
		}
		else
		{
			if(stack[top]<min)
			{
				min=(2*min)-stack[top];
			}
			top--;
		}
	}
	
	public static void getmin()
	{
		if(top==-1)
		{
			System.out.println("Satck is empty");
		}
		else
			System.out.println("Minimum is "+min);
	}
	
	public static void display()
	{
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
				getmin();
				break;
			case 4:
				display();
				break;
			}
		}

	}

}
