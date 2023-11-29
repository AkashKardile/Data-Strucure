package Stack.Array;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesischecker {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Character> s=new Stack<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String parenthesis=sc.next();
		
		for(int i=0;i<parenthesis.length();i++)
		{
			if(s.isEmpty())
			{
				s.push(parenthesis.charAt(i));
			}
			else if(s.peek()=='{' && parenthesis.charAt(i)=='}')
			{
				s.pop();
			}
			else if(s.peek()=='(' && parenthesis.charAt(i)==')')
			{
				s.pop();
			}
			else if(s.peek()=='[' && parenthesis.charAt(i)==']')
			{
				s.pop();
			}
			else
			{
				s.push(parenthesis.charAt(i));
			}
			
				
		}
		
		
		if(s.isEmpty())
		{
			System.out.println("It is valid parenthesis");
		}
		else
		{
			System.out.println("It is not valid parenthesis");
		}

	}

}
