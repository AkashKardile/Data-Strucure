package LinkedList;

import java.util.Scanner;

public class ReverseLinkedingroup {
	static class Node{
		int data;
		
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	static Node head=null;
	static Node tail=null;
	
	public static void insert()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		Node new_node=new Node(data);
		
		if(head==null)
		{
			head=new_node;
			tail=new_node;
		}
		else {
			tail.next=new_node;
			tail=new_node;
		}
	}
	
	public static void reverse()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of node to reverse");
		int k=sc.nextInt();
		
		int i=1;
		Node nextnode=head;
		Node prev=null;
		Node current=head;
		
		
		while(i<=k)
		{		
			nextnode=nextnode.next;
			current.next=prev;
			prev=current;
			current=nextnode;
						
			i++;
		}
		
		Node temp=head;
		head=prev;
		nextnode=current;
		current=current;
		prev=null;
		while(nextnode!=null)
		{
			nextnode=nextnode.next;
			current.next=prev;
			prev=current;
			current=nextnode;
		}
		
		temp.next=prev;
		
	}
	
	public static void display()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp=head;
			
			while(temp!=null)
			{
				System.out.print(temp.data+"--->");
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
			System.out.println("1. insert");
			System.out.println("2. group reverse");
			System.out.println("3. display");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				insert();
				break;
			case 2:
				reverse();
				break;
			case 3:
				display();
				break;
			}
		}

	}

}
