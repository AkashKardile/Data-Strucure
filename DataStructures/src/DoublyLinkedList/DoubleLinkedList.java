package DoublyLinkedList;

import java.util.Scanner;

public class DoubleLinkedList {
	
	static class Node
	{
		int data;
		
		Node prev;
		
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
			tail=new_node;
		}
		else
		{
			tail.next=new_node;
			new_node.prev=tail;
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
			head.prev=new_node;
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
			temp.next.prev=new_node;
			temp.next=new_node;
			new_node.prev=temp;
			
			
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
			head.next.prev=null;
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
//			Node temp=head;
//			Node nextnode=temp.next;
//			
//			while(nextnode.next!=null)
//			{
//				temp=nextnode;
//				nextnode=nextnode.next;
//			}
//			temp.next=null;
			
			tail=tail.prev;
			tail.next.prev=null;
			tail.next=null;
		}
	}
	
	public static void deleteatposition()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position");
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
			temp.next.prev=temp;
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
				System.out.print(temp.data+"---------->");
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
				insertatbeginning();
				break;
			case 3:
				insertatposition();
				break;
			case 4:
				deleteatend();
				break;
			case 5:
				deleteatbegin();
				break;
			case 6:
				deleteatposition();
				break;
			case 12:
				display();
				break;
			}
		}

	}

}
