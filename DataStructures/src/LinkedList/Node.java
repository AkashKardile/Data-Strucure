package LinkedList;

import java.util.Scanner;

public class Node {
	int data;
	
	Node next;
	
	static Node head=null;
	
	static Node tail=null;
	
	public Node(int data)
	{
		this.data=data;
	}
	
	public static void insertatend()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the data");
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
	
	public static void insertatendtail()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the data");
		int data=sc.nextInt();
		
		Node new_node=new Node(data);
		
		if(head==null)
		{
			head=new_node;
			tail=new_node;
		}
		else
		{
			tail.next=new_node;
			tail=new_node;
		}
	}
	
	public static void insertatbeginning()
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
			new_node.next=head;
			head=new_node;
		}
	}
	
	public static void insertatposition()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		Node new_node=new Node(data);
		System.out.println("Enter the position");
		int position=sc.nextInt();
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			Node temp=head;
			
			int i=1;
			
			while(i<position-1)
			{
				temp=temp.next;
				i++;
			}
			new_node.next=temp.next;
			temp.next=new_node;
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
			Node next_node=temp.next;
			
			while(next_node.next!=null)
			{
				temp=next_node;
				next_node=next_node.next;
			}
			temp.next=null;
			tail=temp;
		}
	}
	
	public static void deleteatposition()
	{
		Scanner sc=new Scanner(System.in);
		int position=sc.nextInt();
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp=head;
			//Node nextnode=temp.next;
			int i=1;
			
			while(i<position-1)
			{
//				temp=nextnode;
//				nextnode=nextnode.next;
//				i++;
				temp=temp.next;
			}
			
			//temp.next=nextnode.next;
			
			//temp.next=temp.next.next;
			
			Node nextnode=temp.next;
			temp.next=nextnode.next;
		}
	}
	
	
	public static void deleteatbeginning()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			head=head.next;
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
	
	public static void search()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element which we have to search");
		int key=sc.nextInt();
		
		Node temp=head;
		int cnt=0;
		int pos=1;
		while(temp!=null)
		{
			if(temp.data==key)
			{
				cnt=1;
				break;
			}
			temp=temp.next;
			pos++;
		}
		
		if(cnt==1)
		{
			System.out.println("Element is prsent at "+pos);
		}
		else
		{
			System.out.println("element is not present");
		}
	}

}
