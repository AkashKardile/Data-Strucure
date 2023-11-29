package Stack.Array;

import java.util.Scanner;

public class Reversewordsbyarray {
	
	static char stack[];
	
	static int top=-1;
	
	public static void reverse(String sentence)
	{
		stack=new char[sentence.length()];
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)!=' ')
			{
				top++;
				stack[top]=sentence.charAt(i);
			}
			
			else
			{
				for(int j=top;j>=0;j--)
				{
					System.out.print(stack[j]);
				}
				System.out.print(" ");
				top=-1;
			}
			
			
		}
		
		for(int j=top;j>=0;j--)
		{
			System.out.print(stack[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence=sc.nextLine();
		
		reverse(sentence);
		
		
		

	}

}
