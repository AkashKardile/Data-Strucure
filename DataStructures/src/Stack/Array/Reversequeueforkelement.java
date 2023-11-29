package Stack.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Reversequeueforkelement {
	
	static List<Integer> l=new ArrayList<>();
	
	public static void enqueue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		l.add(data);
	}
	
	public static void reverse()
	{
		Stack<Integer> s=new Stack<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		
		for(int i=0;i<k;i++)
		{
			s.push(l.get(i));
		}
		
		
		int j=0;
		
		while(j<k && s.isEmpty()==false)
		{
			l.set(j,s.peek());
			s.pop();
			j++;
		}
		
		
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Eneueue");
			System.out.println("2. Reverse");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				enqueue();
				break;
			case 2:
				reverse();
				break;
				
			}
		}
		
		

	}

}
