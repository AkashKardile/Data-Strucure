package Stack.Array;

import java.util.Scanner;
import java.util.Stack;

public class Findminimuminstack {
	
	static Stack<Integer> s=new Stack<>();
	static Stack<Integer> s1=new Stack<>();
	public static void push()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		s.push(data);
	}

	public static void find_minimum()
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
					if(s.peek()<s1.peek())
					{
						s1.pop();
						s1.push(s.peek());
						s.pop();
					}
					else
					{
						s.pop();
					}
				}
			}
		
		
		System.out.println(s1.peek());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Push");
			System.out.println("2. Find minimum");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				push();
				break;
			case 2:
				find_minimum();
				break;
			
			}
		}
		
		

	}

}
