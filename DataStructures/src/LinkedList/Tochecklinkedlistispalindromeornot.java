package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tochecklinkedlistispalindromeornot {
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
	static List<Integer> l=new ArrayList<>();
	public static void original()
	{
		
		
		Node temp=head;
		
		while(temp!=null)
		{
			l.add(temp.data);
			temp=temp.next;
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
	
	static List<Integer> l2=new ArrayList<>();
	public static void afterreverse()
	{
		
		
		Node temp=head;
		
		while(temp!=null)
		{
			l2.add(temp.data);
			temp=temp.next;
		}
		
		
	}
	
	public static boolean check()
	{
		
		original();
		reverse();
		afterreverse();
		int cnt=0;
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==l2.get(i))
			{
				cnt++;
			}
		}
		
		if(cnt==l.size())
		{
			return true;
		}
		else
			return false;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. insertlist1");
			System.out.println("2. Check");
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				insert();
				break;
			case 2:
				if(check())
				{
					System.out.println("List is palindrome");
				}
				else
				{
					System.out.println("List is not palindrome");
				}
				break;
			}
		}

	}

}
