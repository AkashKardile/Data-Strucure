package Stack.linkedlist;

import java.util.Scanner;

public class Nodemain {
	static class stack
	{
		int data;
		
		stack next;
		
		stack(int data)
		{
			this.data=data;
		}
	}
	
	static stack top=null;
	
	public static boolean isunderflow()
	{
		if(top==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void push()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		stack new_stack=new stack(data);
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
	
	public static void pop()
	{
		if(isunderflow())
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			top=top.next;
		}
	}
	
	public static void peek()
	{
		if(isunderflow())
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			System.out.println("Peek is: "+top.data);
		}
	}
	
	public static void isempty()
	{
		if(top==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Stack is not empty");
		}
	}
	public static void display()
	{
		if(isunderflow())
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			stack temp=top;
			
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Push");
			System.out.println("2. pop");
			System.out.println("3. Peek");
			System.out.println("4. Is empty");
			System.out.println("5. Display");
			
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
				peek();
				break;
			case 4:
				isempty();
				break;
			case 5:
				display();
				break;
				
			}
		}

	}

}
