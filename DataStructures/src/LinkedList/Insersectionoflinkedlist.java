package LinkedList;

import java.util.Scanner;

import LinkedList.NodesMain.Node;



public class Insersectionoflinkedlist {
	static class Node1
	{
		int data;
		
		Node1 next;
		
		Node1(int data)
		{
			this.data=data;
		}
		
		
	}
	
	static Node1 head1=null;
	
	static Node1 tail1=null;
	
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
	
	

	
	public static void insertList1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		Node1 new_node=new Node1(data);
		
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
	
	public static void insertList2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		Node2 new_node=new Node2(data);
		
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

	public static void intersection()
	{
		Node1 temp=head1;
		
		Node2 temp1=head2;
		
		while(temp!=null)
		{
			temp1=head2;
			while(temp1!=null)
			{
				if(temp.data==temp1.data)
				{
					Node3 new_node=new Node3(temp.data);
					
					if(head3==null)
					{
						head3=new_node;
						tail3=new_node;
						
					}
					else
					{
						tail3.next=new_node;
						tail3=new_node;
					}
					
				}
				temp1=temp1.next;
				
			}
			temp=temp.next;
		}
	}
	
	public static void removeduplicates()
	{
		Node3 temp=head3;
		
		while(temp.next!=null)
		{
			if(temp.data==temp.next.data)
			{
				temp.next=temp.next.next;
			}
			temp=temp.next;
		}
	}
	public static void display()
	{
		if(head3==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node3 temp=head3;
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
			System.out.println("1. insertlist1");
			System.out.println("2. insertlist2");
			System.out.println("3. intersection");
			System.out.println("4. removeduplicates");
			System.out.println("5. display");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				insertList1();
				break;
			case 2:
				insertList2();
				break;
			case 3:
				intersection();
				break;
			case 4:
				removeduplicates();
				break;
			case 5:
				display();
				break;
			}
		}

	}

}
