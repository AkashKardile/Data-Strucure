package LinkedList;

import java.util.Scanner;

import LinkedList.NodesMain.Node;

public class DeletesmallerNode {
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	static Node head=null;
	static Node tail=null;
	
	
	public static void insertatend()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		Node new_node=new Node(data);
		
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			Node temp=head;
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_node;
		}
	}
	
	public static int length()
	{
		int len=0;
		
		Node temp=head;
		
		while(temp!=null)
		{
			temp=temp.next;
			len++;
		}
		
		return len;
	}
	public static void deletesmallnode()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp1=head;
			Node current=null;
			
			int i=1;
			
			while(i<=length())
			{
				temp1=head;
				while(temp1!=null)
				{
					Node temp2=temp1.next;
					
					while(temp2!=null)
					{
						if(temp1.data<temp2.data && temp1==head)
						{
							head=temp2;
							break;
						}
						else if(temp1.data<temp2.data)
						{
							temp1=current;
							temp1.next=temp2;
							break;
						}
						temp2=temp2.next;
					}
					current=temp1;
					temp1=temp1.next;
					i++;
				}
				
			}
		}
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
				System.out.print(temp.data+"---->");
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
				System.out.println("1. Insert at end: ");
				System.out.println("2. deletenode");
				System.out.println("3. Display");
				

				System.out.println("Enter your choice:");
				int ch=sc.nextInt();
				
				switch(ch)
				{
				case 1:
					insertatend();
					break;
				case 2:
					deletesmallnode();
					break;
				case 3:
					display();
					break;
				}
			}
		}

	}


