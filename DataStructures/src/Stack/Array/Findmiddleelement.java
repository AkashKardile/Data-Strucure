package Stack.Array;

import java.util.Scanner;
import java.util.Stack;

public class Findmiddleelement {
	
	static Stack<Integer> s=new Stack<>();
	
	public static void push()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		s.push(data);
	}
	
	public static void pop()
	{
		if(s.isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			s.pop();
		}
	}
	
	public static void findmiddleelement()
	{
		int size=s.size();
		if(size%2!=0)
		{
			System.out.println(s.get(size/2));
		}
		else
		{
			System.out.println(s.get(size/2-1)+" "+s.get(size/2));
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
			System.out.println("3. find middle element");
			
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
				findmiddleelement();
				break;
			}
		}
		
		
		
		

	}

}
