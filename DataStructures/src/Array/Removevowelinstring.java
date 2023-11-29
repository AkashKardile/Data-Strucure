package Array;

import java.util.Scanner;

public class Removevowelinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String str=sc.next();
		String str1="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
			{
				continue;
			}
			else
			{
				str1=str1+str.charAt(i);
			}
		}
		
		System.out.println(str1);

	}

}
