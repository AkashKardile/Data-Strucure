package LinkedList;

import java.util.Scanner;



public class Mideelement {
	
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
	
	public static void middlelelement()
	{
		int len=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			len++;
		}
		
		int mid=(len+1)/2;
		
		int i=1;
		
		temp=head;
		
		while(i<mid)
		{
			temp=temp.next;
			i++;
		}
		
		System.out.println("Middle element is  "+temp.data);
		
		
	}
	
	public static void middleeven()
	{
		int len=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			len++;
		}
		
		
		int mid=(len/2);
		
		int i=1;
		
		temp=head;
		
		while(temp!=null)
		{
			if(i==mid || i==(mid+1))
			{
				System.out.println(temp.data);
				if(i==(mid+1))
				{
					break;
				}
			}
			temp=temp.next;
			i++;
		}
	}
	
	
	public static void removemiddleeleemnt()
	{
		int len=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			len++;
		}
		
		temp=head;
		int i=1;
		
		int mid=(len+1)/2;
		while(i<mid-1)
		{
			temp=temp.next;
			i++;
		}
		temp.next=temp.next.next;
	}
	
	public static void rotate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rotation");
		int n=sc.nextInt();
		
		int len=0;
		
		Node temp=head;
		
		while(temp!=null)
		{
			temp=temp.next;
			len++;
		}
		temp=head;
		if(n<len)
		{
			n=n;
		}
		else if(n==len)
		{
			n=0;
		}
		else
		{
			n=n%len;
		}
		
		int k=len-n;
		
		int i=1;
		
		while(i<k)
		{
			temp=temp.next;
			i++;
		}
		
		Node knode=temp;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=head;
		head=knode.next;
		knode.next=null;
	}
	
	public static void display()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else {
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
			System.out.println("1.Insert data");
			System.out.println("2. Middleelement odd");
			System.out.println("3. Middleelement even");
			System.out.println("4. Revove middleeleent");
			System.out.println("5. Rotation");
			System.out.println("6. Display");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				insert();
				break;
			case 2:
				middlelelement();
				break;
			case 3:
				middleeven();
				break;
			case 4:
				removemiddleeleemnt();
				break;
			case 5:
				rotate();
				break;
			case 6:
				display();
				break;
			}
		}

	}

}
