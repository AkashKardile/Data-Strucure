package Circularlinkedlist;

import java.util.Scanner;

import Circularlinkedlist.Nodemain.Node;



public class splitthelistintwocircularlist {
	
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
	
	public static void insert()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		Node new_node=new Node(data);
		
		if(head==null)
		{
			head=new_node;
			head.next=head;
			tail=new_node;
		}
		else
		{
			new_node.next=head;
			tail.next=new_node;
			tail=new_node;
			
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
	
	static Node2 head2=null;
	static Node2 tail2=null;
	
	static class Node3
	{
		int data;
		
		Node3 next;
		
		Node3(int data)
		{
			this.data=data;
		}
	}
	
	static Node3 head3=null;
	static Node3 tail3=null;
	public static int len()
	{
		int len=1;
		Node temp=head;
		while(temp.next!=head)
		{
			len++;
			temp=temp.next;
		}
		return len;
	}
	
	public static void split()
	{
		int len=len();
		System.out.println(len);
		Node temp=head;
		if(len%2!=0)
		{
			int mid=len/2+1;
			
			int i=0;
			
			while(i<mid)
			{
				Node2 new_node=new Node2(temp.data);
				
				if(head2==null)
				{
					head2=new_node;
					head2.next=head2;
					tail2=new_node;
				}
				else
				{
					new_node.next=head2;
					tail2.next=new_node;
					tail2=new_node;
					
				}
				i++;
				temp=temp.next;
			}
			
			
			Node3 new_node=null;
			while(temp!=head)
			{
				new_node=new Node3(temp.data);
				if(head3==null)
				{
					head3=new_node;
					head3.next=head3;
					tail3=new_node;
				}
				else
				{
					new_node.next=head3;
					tail3.next=new_node;
					tail3=new_node;
					
				}
				temp=temp.next;
			}
			
		
		}
			else
			{
				int mid=len/2;
				
				
				int i=0;
				
				while(i<mid)
				{
					Node2 new_node=new Node2(temp.data);
					
					if(head2==null)
					{
						head2=new_node;
						head2.next=head2;
						tail2=new_node;
					}
					else
					{
						new_node.next=head2;
						tail2.next=new_node;
						tail2=new_node;
						
					}
					i++;
					temp=temp.next;
				}
				
				Node3 new_node=null;
				while(temp!=head)
				{
					new_node=new Node3(temp.data);
					if(head3==null)
					{
						head3=new_node;
						head3.next=head3;
						tail3=new_node;
					}
					else
					{
						new_node.next=head3;
						tail3.next=new_node;
						tail3=new_node;
						
					}
					temp=temp.next;
				}
				
			}
		}
	
	public static void display1()
	{
		if(head2==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node2 temp=head2;
			
			while(temp.next!=head2)
			{
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}
			System.out.print(temp.data);
			System.out.println();
		}
	}
	
	public static void display2()
	{
		if(head3==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node3 temp=head3;
			
			while(temp.next!=head3)
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
			System.out.println("1. insertlist1");
			System.out.println("2.split");
			System.out.println("3. display1");
			System.out.println("4. display2");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				insert();
				break;
			case 2:
				split();
				break;
			case 3:
				display1();
				break;
			case 4:
				display2();
				break;
			
			}
		}

	}

}
