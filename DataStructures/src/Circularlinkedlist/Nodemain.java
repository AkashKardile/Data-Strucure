package Circularlinkedlist;

import java.util.Scanner;

public class Nodemain {
	
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
	
	public static void insertatbegin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		Node new_node=new Node(data);
		
		if(head==null)
		{
			head=new_node;
			tail=new_node;
			new_node.next=head;
		}
		else
		{
			new_node.next=head;
			head=new_node;
			tail.next=head;
		}
	}
	
	public static void insertatend()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		Node new_node=new Node(data);
		
		if(head==null)
		{
			tail=new_node;
			head=new_node;
			tail.next=head;
		}
		else
		{
			tail.next=new_node;
			tail=new_node;
			tail.next=head;
		}
	}
	
	public static void insertatposition()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		Node new_node=new Node(data);
		
		System.out.println("Enter the position");
		int pos=sc.nextInt();
		
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			Node temp=head;
			int i=1;
			
			while(i<pos-1)
			{
				temp=temp.next;
				i++;
			}
			new_node.next=temp.next;
			temp.next=new_node;
		}
	}
	
	public static void deleteatbegin()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			tail.next=head.next;
			head=head.next;
		}
	}
	
	public static void deleteatend()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp=head;
			Node nextnode=temp.next;
			
			while(nextnode.next!=head)
			{
				temp=nextnode;
				nextnode=nextnode.next;
			}
			
			temp.next=head;
			tail=temp;
		}
	}
	
	public static void deleteatposition()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position");
		int pos=sc.nextInt();
		
		Node temp=head;
		int i=1;
		while(i<pos-1)
		{
			temp=temp.next;
			i++;
		}
		temp.next=temp.next.next;
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
			
			while(temp.next!=head)
			{
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}
			System.out.print(temp.data);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. insertatbegin");
			System.out.println("2. insertatend");
			System.out.println("3. insertatposition");
			System.out.println("4. deleteatbegin");
			System.out.println("5. deleteatend");
			System.out.println("6. deletetpostion");
			System.out.println("7. Display");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				insertatbegin();
				break;
			case 2:
				insertatend();
				break;
			case 3:
				insertatposition();
				break;
			case 4:
				deleteatbegin();
				break;
			case 5:
				deleteatend();
				break;
			case 6:
				deleteatposition();
				break;
			case 7:
				display();
				break;
			}
		}

	}

}
