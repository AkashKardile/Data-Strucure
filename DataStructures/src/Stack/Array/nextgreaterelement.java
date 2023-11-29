package Stack.Array;

import java.util.Scanner;
import java.util.Stack;

public class nextgreaterelement {
	
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
	
	public static void nextgreaterelement()
	{
		while(s.isEmpty()==false)
		{
			if(s1.isEmpty())
			{
				s1.push(s.peek());
				s.pop();
				s2.push(-1);
			}
			else
			{
				while(s1.isEmpty()==false && s1.peek()<s.peek())
				{
					s1.pop();
					
				}
				
				if(s1.isEmpty())
				{
					s2.push(-1);
					s1.push(s.peek());
					s.pop();
					
				}
				else
				{
					s2.push(s1.peek());
					s1.push(s.peek());
					s.pop();
					
				}
			}
			
		}
			
		while(s2.isEmpty()==false)
		{
			s.push(s2.peek());
			s2.pop();
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
			System.out.println("2. next greater");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				push();
				break;
			case 2:
				nextgreaterelement();
				break;
			
			}
		}
		

	}

}
