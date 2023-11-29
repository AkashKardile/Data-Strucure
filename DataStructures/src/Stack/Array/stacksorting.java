package Stack.Array;

import java.util.Scanner;
import java.util.Stack;

public class stacksorting {
	
	static Stack<Integer> s=new Stack<>();
	static Stack<Integer> s1=new Stack<>();
	static Stack<Integer> s2=new Stack<>();
	
	public static void push()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		s.push(data);
	}
	
	public static void sorting()
	{
		while(s.isEmpty()==false)
		{
			if(s1.isEmpty())
			{
				s1.push(s.peek());
				s.pop();
				
			}
			else
			{
				while(s1.isEmpty()==false && s1.peek()>s.peek())
				{
					s2.push(s1.peek());
					s1.pop();
					
				}
				s1.push(s.peek());
				s.pop();
				
				while(s2.isEmpty()==false)
				{
					s1.push(s2.peek());
					s2.pop();
				}
			}
			
		}
			
		while(s1.isEmpty()==false)
		{
			s.push(s1.peek());
			s1.pop();
		}
			for(int i=0;i<s.size();i++)
			{
				System.out.print(s.get(i)+" ");
			}
			System.out.println();
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Push");
			System.out.println("2. sort");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				push();
				break;
			case 2:
				sorting();
				break;
			
			}
		}

	}

}
