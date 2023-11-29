package Stack.Array;

import java.util.Scanner;

public class ReverseWords {
	
	static class stack{
		char c;
		
		stack next;
		
		stack(char c)
		{
			this.c=c;
		}
		
		
	}
	
	static stack top=null;
	
	public static void reverse(String sentence)
	{
		String data[]=sentence.split(" ");
		
		String str="";
		
		for(int i=0;i<data.length;i++)
		{
			top=null;
			for(int j=0;j<data[i].length();j++)
			{
				stack new_stack=new stack(data[i].charAt(j));
				if(top==null)
				{
					top=new_stack;
				}
				else
				{
					new_stack.next=top;
					top=new_stack;
				}
			}
			
			stack temp=top;
			String word="";
			while(temp!=null)
			{
				word=word+temp.c;
				temp=temp.next;
			}
			
			str=str+word+" ";
		}
		
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence=sc.nextLine();
		
		reverse(sentence);

	}

}
