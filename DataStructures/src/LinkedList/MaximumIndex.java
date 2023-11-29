package LinkedList;

import java.util.Scanner;

import LinkedList.Makethelastnodeatfirst.Node;

public class MaximumIndex {
	
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
			tail=new_node;
		}
		else
		{
			tail.next=new_node;
			tail=new_node;
		}
	}
	public static int maxindexnode()
	{
		Node temp=head;
		int cnt=0;
		int node=0;
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		while(temp!=null)
		{
			i++;
			
			if(i%k==0)
			{
				node=temp.data;
				cnt++;
			}
			temp=temp.next;
		}
		
		if(cnt==0)
		{
			return -1;
		}
		else
		{
			return node;
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
			System.out.println("1. Insert");
			System.out.println("2.Maxindexnode");
			System.out.println("3. display");
			
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			
			
			switch(ch)
			{
			case 1:
				insert();
				break;
			case 2:
				System.out.println(maxindexnode());
				break;
				
			case 3:
				display();
				break;
			}
		}

	}

}
