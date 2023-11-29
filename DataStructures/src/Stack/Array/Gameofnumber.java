package Stack.Array;

import java.util.Scanner;

public class Gameofnumber {
	
	static int n=8;
	
	static int arr[]=new int[n];
	
	static int top=-1;
	static int stack[]=new int[n];
	public static void addnumber()
	{
		if(top==n-1)
		{
			System.out.println("Stack is overflow");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int number=sc.nextInt();
			
			top++;
			arr[top]=number;
		}
	}
	
	public static void numbergame()
	{
		int brr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int cnt=0;
			int j=0;
			for(j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					cnt=1;
					
					break;
				}
				
			}
			if(cnt==1)
			{
				brr[i]=arr[j];
				
			}
			else
			{
				brr[i]=-1;
			}
		}
		
		
				
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((arr[j]==brr[i] || brr[i]==-1) && j>=i)
				{
					int cnt=0;
					
					int k=0;
					
					for(k=j+1;k<n;k++)
					{
						if(arr[k]<brr[i])
						{
							cnt=1;
							break;
						}
						
					}
					if(cnt==1)
					{
						stack[i]=arr[k];
					}
					else
					{
						stack[i]=-1;
					}
					break;
				}
			}
		}
		
	}
	
	public static void display()
	{
		for(int i=0;i<n;i++)
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
			System.out.println("1. addnumber");
			System.out.println("2. gamenumber");
			System.out.println("3. display");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				addnumber();
				break;
			case 2:
				numbergame();
				break;
			case 3:
				display();
				break;
			}
		}

	}

}
