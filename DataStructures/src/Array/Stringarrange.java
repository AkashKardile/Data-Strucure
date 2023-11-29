package Array;

import java.util.Scanner;

public class Stringarrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str=sc.nextLine();
		
		
		String str1="";
		int j=0;
		for(int i=0;i<str.length();i=j)
		{
			int cnt=1;
			j=i+1;
			
			while( j<str.length()&& str.charAt(i)==str.charAt(j))
			{
				cnt++;
				j++;
			}
			
			if(cnt==1)
			{
				str1=str1+String.valueOf(str.charAt(i));
			}
			else
			{
			str1=str1+String.valueOf(str.charAt(i))+String.valueOf(cnt);
			}
			
			
		}
		
		
		System.out.println(str1);

	}

}
