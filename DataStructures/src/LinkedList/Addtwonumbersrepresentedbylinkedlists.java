package LinkedList;

import java.util.Scanner;

public class Addtwonumbersrepresentedbylinkedlists {
	
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
	
	static class Node
	{
		int data;
		
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	public static Node head1=null;
	public static Node tail1=null;
	
	public static void insertlist1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		Node new_node=new Node(data);
		
		if(head1==null)
		{
			head1=new_node;
			tail1=new_node;
		}
		else
		{
			tail1.next=new_node;
			tail1=new_node;
		}
	}
	
	static class Node2
	{
		int data;
		
		Node2 next;
		
		Node2(int data)
		{
			this.data=data;
		}
	}
	
	public static Node head2=null;
	public static Node tail2=null;
	
	public static void insertList2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		Node new_node=new Node(data);
		
		if(head2==null)
		{
			head2=new_node;
			tail2=new_node;
		}
		else
		{
			tail2.next=new_node;
			tail2=new_node;
		}
	}
	
	public static void resultant()
	{
		Node temp1=head1;
		Node temp2=head2;
		int number1=0;
		int number2=0;
		while(temp1!=null)
		{
			number1=(number1*10)+temp1.data;
			temp1=temp1.next;
		}
		
		while(temp2!=null)
		{
			number2=(number2*10)+temp2.data;
			temp2=temp2.next;
		}
		
		number2=number1+number2;
		System.out.println(number2);
		while(number2!=0)
		{
			int rem=number2%10;
			System.out.println(rem);
			stack new_stack=new stack(rem);
			
			if(top==null)
			{
				top=new_stack;
			}
			else
			{
				new_stack.next=top;
				top=new_stack;
			}
			
			number2=number2/10;
			
		}
		
		
		
	}
	
	public static void display()
	{
		
			stack temp=top;
			
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. insert list 1");
			System.out.println("2. insert list 2");
			System.out.println("3. Resultant");
			System.out.println("4. Display");
			
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				insertlist1();
				break;
			case 2:
				insertList2();
				break;
			case 3:
				resultant();
				break;
			case 4:
				display();
				break;
			
			}
		}


	}

}
