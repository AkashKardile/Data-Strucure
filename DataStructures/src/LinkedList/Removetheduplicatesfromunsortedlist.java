package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Removetheduplicatesfromunsortedlist {
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
	
	public static void removeduplicates()
	{
		Node temp=head; 
		Node prev=null;
		List<Integer> l=new ArrayList<>();
		while(temp!=null)
		{
			
			
			if(l.contains(temp.data))
			{
				temp=prev;
				temp.next=temp.next.next;
			}
			l.add(temp.data);
			prev=temp;
			temp=temp.next;
		}
	}
	
	public static void display()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. insert");
			System.out.println("2. Remove duplicates");
			System.out.println("3.. display");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				insert();
				break;
			case 2:
				removeduplicates();
				break;
			case 3:
				display();
				break;
			}
		}


	}

}
