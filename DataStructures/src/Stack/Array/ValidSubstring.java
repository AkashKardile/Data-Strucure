package Stack.Array;

import java.util.Scanner;
import java.util.Stack;

public class ValidSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		
		char c[]=str.toCharArray();
		int max=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=i;j<c.length;j++)
			{
				int k=0;
				Stack<Character> s=new Stack<>();
				for(k=i;k<=j;k++)
				{
					if(s.isEmpty())
					{
						s.push(c[k]);
					}
					else
					{
						if(s.peek()=='(' && c[k]==')')
						{
							s.pop();
						}
						else
						{
							s.push(c[k]);
						}
							
					}
				}
				
				if(s.isEmpty())
				{
					if((j-i+1)>max)
					{
						max=j-i+1;
					}
				}
				
				
			}
		}

		System.out.println(max);
	}

}
