package LinkedList;

import java.util.Scanner;

import LinkedList.NodesMain.Node;

public class InsertionNodeinsortedlinkedlist {
	
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
			tail=new_node;
		}
		else
		{
			tail.next=new_node;
			tail=new_node;
		}
	}
	
	
	
	public static void insertnodeinsorted()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data which we have to insert");
		int key=sc.nextInt();
		
		Node new_node=new Node(key);
		
		
		if(key<head.data)
		{
			new_node.next=head;
			head=new_node;
		}
		else if(tail.data<key)
		{
			tail.next=new_node;
			tail=new_node;
		}
		else 
		{
			Node temp=head;
			Node current=null;
			while(temp.data<key && temp.next!=null)
			{
				current=temp;
				temp=temp.next;
			}
			temp=current;
			new_node.next=temp.next;
			temp.next=new_node;
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
			System.out.println("2. for insertnodeinsorted");
			System.out.println("3. display");
			
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			
			
			switch(ch)
			{
			case 1:
				insertatend();
				break;
			case 2:
				insertnodeinsorted();
				break;
			case 3:
				display();
				break;
			}
			
		}

	}

}
