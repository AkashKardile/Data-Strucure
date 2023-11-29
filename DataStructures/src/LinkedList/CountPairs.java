package LinkedList;

import java.util.Scanner;



public class CountPairs {
	
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
	
	public static void insertatendnode1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements for list 1");
		int n1=sc.nextInt();
		
		System.out.println("Enter the data");
		
		for(int i=0;i<n1;i++)
		{
		int data=sc.nextInt();
		
		Node1 new_node=new Node1(data);
		
		if(head1==null)
		{
			head1=new_node;
		}
		else
		{
			Node1 temp=head1;
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_node;
		}
		}
		
		
	}
		
		
		public static void insertatendNode2()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements for list 2");
			int n2=sc.nextInt();
			System.out.println("Enter the data");
			
			for(int i=0;i<n2;i++)
			{
			int data=sc.nextInt();
			
			Node2 new_node=new Node2(data);
			
			if(head2==null)
			{
				head2=new_node;
			}
			else
			{
				Node2 temp=head2;
				
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=new_node;
			}
			}
		}
		
		public static void countpairs()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the target sum");
			int x=sc.nextInt();
			Node1 first=head1;
			int cnt=0;
			while(first!=null)
			{
				Node2 second=head2;
				while(second!=null)
				{
					if((first.data+second.data)==x)
					{
						cnt++;
					}
					second=second.next;
				}
				
				first=first.next;
			}
			
			System.out.println("Count Pairs: "+cnt);
		}
		public static void displayList1()
		{
			if(head1==null)
			{
				System.out.println("List is empty");
			}
			else
			{
				Node1 temp=head1;
				while(temp!=null)
				{
					System.out.print(temp.data+"---->");
					temp=temp.next;
				}
				System.out.println();
			}
		}
		
		public static void displayList2()
		{
			if(head2==null)
			{
				System.out.println("List is empty");
			}
			else
			{
				Node2 temp=head2;
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
			System.out.println("1. Insert at end list 1");
			System.out.println("2. Insert at end list 2");
			System.out.println("3. count pairs");
			System.out.println("4. Display List 1");
			System.out.println("5. Display List 2");
			
			
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				
					insertatendnode1();
				
				break;
			case 2:
				
					insertatendNode2();
				
				break;
			case 3:
				countpairs();
				break;
			case 4:
				displayList1();
				break;
			case 5:
				displayList2();
				break;
			}
		}

	}

}
