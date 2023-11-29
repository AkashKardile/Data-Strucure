package Stack.Array;

import java.util.Scanner;

public class Printinreverse {
	static char c[];
	static int top=-1;
	public static void insertinstack(String name)
	{
		
		int n=name.length();
		c=new char[n];
		
		for(int i=0;i<c.length;i++)
		{
			top++;
			c[top]=name.charAt(i);
		}
	}
	
	public static void displayinreverse()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.print(c[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		
		insertinstack(name);
		displayinreverse();
		

	}

}
