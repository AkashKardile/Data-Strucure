package Stack.Array;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringusingstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Character> s=new Stack<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=sc.next();
		
		
		Stack<Character> s1=new  Stack<>();
		
		
		for(int i=0;i<name.length();i++)
		{
			s.push(name.charAt(i));
		}
		
		
	while(s.isEmpty()==false)
	{
		s1.push(s.peek());
		s.pop();
	}

	name="";
	for(int i=0;i<s1.size();i++)
	{
		name=name+s1.get(i);
	}
	
	System.out.println(name);
	}

}
