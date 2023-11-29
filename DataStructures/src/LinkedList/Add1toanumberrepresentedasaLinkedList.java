package LinkedList;

import java.util.Scanner;



public class Add1toanumberrepresentedasaLinkedList {
	static class Node
	{
		int data;
		
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	public static Node head=null;
	public static Node tail=null;
	
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
	
	public static void addition()
	{
		Node temp=head;
		
		int number=0;
		
		while(temp!=null)
		{
			number=(number*10)+temp.data;
			temp=temp.next;
		}
		
		System.out.println("The answer is: "+(number+1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. insert");
			System.out.println("2. Addition");
			
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				insert();
				break;
			case 2:
				addition();
				break;
			
			}
		}


	}

}
