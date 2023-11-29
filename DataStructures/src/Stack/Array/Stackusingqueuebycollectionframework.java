package Stack.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Stackusingqueuebycollectionframework {
	static List<Integer> l=new ArrayList<>();
	public static void push()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		if(l.isEmpty()==true)
		{
			l.add(data);
		}
		else
		{
			l.add(data);
			int size=l.size()-1;
			
			while(size>0)
			{
				l.add(l.get(0));
				l.remove(0);
				size--;
			}
		}
		
	}
	
	public static void pop()
	{
		if(l.isEmpty()==true)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			l.remove(0);
		}
	}
	
	
	public static void display()
	{
		if(l.isEmpty()==true)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(int i=0;i<l.size();i++)
			{
				System.out.print(l.get(i)+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			}
		}
		
		
		
		
		

	}

}
