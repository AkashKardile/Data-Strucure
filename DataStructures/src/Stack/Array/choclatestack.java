package Stack.Array;

import java.util.Scanner;

public class choclatestack {
	
	static int n=4;
	
	static int stack[]=new int[n];
	
	
	static int top=-1;
	
	public static void insert()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			top++;
			stack[top]=sc.nextInt();
		}
	}
	
	public static void printstack()
	{
		int stack1[]=new int[n];
		top=-1;
		for(int i=0;i<n;i++)
		{
			if(stack[i]>0)
			{
				top++;
				stack1[top]=stack[i];
			}
			else
			{
				System.out.print(stack1[top]+" ");
				top--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert();
		printstack();
		
		

	}

}
