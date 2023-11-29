package LinkedList;

import java.util.Scanner;

public class NodesMain {
	
	static class Node
	{
		int data;
		int data1;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	static Node head=null;
	static Node tail=null;
	
	public static void insertatBeginning()
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
	
	public static void insertatendtail()
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
		else
		{
			tail.next=new_node;
			tail=new_node;
		}
	}
	
	public static void insertatposition()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		System.out.println("Enter the position:");
		int pos=sc.nextInt();
		
		Node new_node=new Node(data);
		
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
			
			while(nextnode.next!=null)
			{
				temp=nextnode;
				nextnode=nextnode.next;
			}
			temp.next=null;
			tail=temp;
		}
	}
	
	public static void deleteatposition()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position:");
		int pos=sc.nextInt();

		if(head==null)
		{
			System.out.println("List is empty");
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
			temp.next=temp.next.next;
		}
	}
	
	public static void search()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element which we have to search");
		int key=sc.nextInt();
		
		Node temp=head;
		int cnt=0;
		int pos=0;
		while(temp!=null)
		{
			pos++;
			if(temp.data==key)
			{
				cnt=1;
				break;
			}
			temp=temp.next;
			
			
		}

		if(cnt==1)
		{
			System.out.println("Eleemnt present at position "+pos);
		}
		else
		{
			System.out.println("Element is not present");
		}
	}
	
	public static void lengthoflist()
	{
		Scanner sc=new Scanner(System.in);
		int pos=0;
		
		Node temp=head;
		
		while(temp!=null)
		{
			temp=temp.next;
			pos++;
			
			
			
			
		}
		
		System.out.println(pos);
	}
	
	public static void sorting()
	{
		Node first=head;
		
		while(first!=null)
		{
			Node second=first.next;
			
			while(second!=null)
			{
				if(second.data<first.data)
				{
					int temp=first.data;
					first.data=second.data;
					second.data=temp;
					
				}
				second=second.next;
			}
			first=first.next;
		}
	}
	
	public static void reverse()
	{
		Node current=head;
		Node nextnode=head;
		Node prev=null;
		tail=current;
		while(nextnode!=null)
		{
			nextnode=nextnode.next;
			current.next=prev;
			prev=current;
			current=nextnode;
		}
		
		head=prev;
		
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
			System.out.println("2. Insert at beginning:");
			System.out.println("3. Insert at position");
			System.out.println("4. Delete at  end");
			System.out.println("5. Delete at beginning:");
			System.out.println("6. Delete at position");
			System.out.println("7.Insertion at end tail");
			System.out.println("8. Searching");
			System.out.println("9. Length");
			System.out.println("10. Sorting");
			System.out.println("11.Reverse");
			System.out.println("12. Display");
			
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				insertatend();
				break;
			case 2:
				insertatBeginning();
				break;
			case 3:
				insertatposition();
				break;
			case 4:
				deleteatend();
				break;
			case 5:
				deleteatbeginning();
				break;
			case 6:
				deleteatposition();
				break;
				
			case 7:
				insertatendtail();
				break;
			case 8:
				search();
				break;
			case 9:
				lengthoflist();
				break;
			case 10:
				sorting();
				break;
			case 11:
				reverse();
				break;
			case 12:
				display();
				break;
			default:
				System.out.println("Please enter valid choice:");
			}
		}
		

	}

}
