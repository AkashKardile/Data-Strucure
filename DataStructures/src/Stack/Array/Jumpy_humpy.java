package Stack.Array;

import java.util.Scanner;

	public class Jumpy_humpy {
	static int n=5;
	
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
	
	public static void maxXor()
	{
		int maxor=0;
		for(int i=0;i<top;i++)
		{
			
			int xors=0;
			int j=0;
			for(j=i;j<top;j++)
			{
				if(stack[j]>stack[j+1])
				{
					break;
				}
				else
				{
					xors=xors^stack[j];
					
				}
			}
			xors=xors^stack[j];
			if(maxor<xors)
			{
				maxor=xors;
			}
		}
		System.out.println(maxor);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		insert();
		maxXor();

	}

}
