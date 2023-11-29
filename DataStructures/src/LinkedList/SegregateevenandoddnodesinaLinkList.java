package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LinkedList.NodesMain.Node;

public class SegregateevenandoddnodesinaLinkList {
	
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
	
	public static void sortedevenodd()
	{
		
		List<Integer> l=new ArrayList<>();
		
		Node temp=head;
		Node prev=null;
		while(temp!=null)
		{
			if((temp.data)%2!=0)
			{
				if(temp==head)
				{
					l.add(head.data);
					head=head.next;
				}
				else
				{
					l.add(temp.data);
					temp=prev;
					
					temp.next=temp.next.next;
				}
			}
			prev=temp;
			temp=temp.next;
			
		}
		tail=prev;
		for(int i=0;i<l.size();i++)
		{
			Node new_node=new Node(l.get(i));
			
			tail.next=new_node;
			tail=new_node;
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
			System.out.println("1. insert");
			System.out.println("2. sorted");
			System.out.println("3. display");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				insert();
				break;
			case 2:
				sortedevenodd();
				break;
			case 3:
				display();
				break;
			}
		}

	}

}
