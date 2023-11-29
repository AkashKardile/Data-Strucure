package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrowinonedirection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String arrow=sc.next();
		
		List<Integer> l=new ArrayList<>();
	
		int a1=0;
		int a2=0;
		int a3=0;
		int a4=0;
		for(int i=0;i<arrow.length();i++)
		{
			if(arrow.charAt(i)=='u')
			{
				a1++;
			}
			else if(arrow.charAt(i)=='d')
			{
				a2++;
			}
			else if(arrow.charAt(i)=='l')
			{
				a3++;
			}
			else
			{
				a4++;
			}
		}
		
		
		l.add(a1);
		l.add(a2);
		l.add(a3);
		l.add(a4);
		
		int max=0;
	
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)>max)
			{
				max=l.get(i);
			}
		}
		
		System.out.println("Minimum no of rotation: "+(arrow.length()-max));

	}

}
