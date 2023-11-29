package LinkedList;

import java.util.Scanner;

import LinkedList.ReverseLinkedingroup.Node;

public class Reverseinpair {
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
	
	public static int length()
	{
		Node temp=head;
		int len=0;
		while(temp!=null)
		{
			len++;
			temp=temp.next;
		}
		
		return len;
	}
	
	public static void reverse()
	{
			Node nextnode=head;
			Node current=head;
			Node prev=null;
			Node temp=head;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			int len=length();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no of node to be reversed");
			int k=sc.nextInt();
			
			int var=k;
			if(len%k==0)
			{
					int i=1;
					while(i<=k)
					{
						nextnode=nextnode.next;
						current.next=prev;
						prev=current;
						current=nextnode;
						i++;
					}
						
					
					k=var+k;
					head=prev;
					Node new_head=temp;
					prev=null;
					
					while(nextnode!=null)
					{
						temp=current;
						while(i<=k)
						{
							nextnode=nextnode.next;
							current.next=prev;
							prev=current;
							current=nextnode;
							i++;
						}
						
						k=var+k;
						new_head.next=prev;
						new_head=temp;
						prev=null;
					}
					tail=temp;
				}
				else
				{
						int x=len-len%k;
		
						int i=1;
						while(i<=k)
						{
							nextnode=nextnode.next;
							current.next=prev;
							prev=current;
							current=nextnode;
							i++;
						}
							
						head=prev;
						Node new_head=temp;
						prev=null;
					
						if(k<x)
						{
							while(nextnode!=null)
							{
								k=k+var;
								temp=current;
								while(i<=k)
								{
									nextnode=nextnode.next;
									current.next=prev;
									prev=current;
									current=nextnode;
									i++;
								}
								
								new_head.next=prev;
								new_head=temp;
								prev=null;
								if(x==k)
									break;
								
							}
						
						}
						new_head.next=current;
						
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
