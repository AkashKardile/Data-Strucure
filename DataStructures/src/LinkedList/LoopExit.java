package LinkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LoopExit {
	
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
	
	public static void loop()
	{
		Scanner sc=new Scanner(System.in);
		Node temp=head;
		
		int i=1;
		
		while(i<3)
		{
			temp=temp.next;
			i++;
		}
		
		Node kthnode=temp.next;
		temp=head;
		
		System.out.println("Enter the when you want the loop");
		int myloop=sc.nextInt();
		i=1;
		while(i<myloop)
		{
			temp=temp.next;
			i++;
		}
		temp.next=kthnode;
	}
	
	public static boolean check()
	{
		Set<Node> l=new HashSet<>();
		
		Node temp=head;
		
		while(temp!=null)
		{
			if(l.contains(temp))
			{
				return true;
			}
			l.add(temp);
			temp=temp.next;
		}
		return false;
		
	}
	
//	public static boolean loops() {
//	    if (head == null) {
//	        System.out.println("LL is empty");
//	        return false; // No loop in an empty list
//	    } else {
//	        Node slow = head;
//	        Node fast = head;
//
//	        while (fast != null && fast.next != null) {
//	            slow = slow.next;
//	            fast = fast.next.next;
//
//	            if (slow == fast) {
//	                // Loop detected
//	                return true;
//	            }
//	        }
//	    }
//	    return false;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Press 1 for insert");
			System.out.println("Press 2 for loop");
			System.out.println("Press 3 for check;");
			
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				insert();
				break;
			case 2:
				loop();
				break;
			case 3:
				if(check())
				{
					System.out.println("Loop Exist");
				}
				else
				{
					System.out.println("Loop not exist");
				}
				break;
			}
		}

	}

}
