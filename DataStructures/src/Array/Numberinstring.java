package Array;

import java.util.Scanner;

public class Numberinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str=sc.nextLine();
		
		int cnt=0;
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57)
			{
				int n=(int)str.charAt(i)-48;
				sum=sum+n;
				cnt++;
			}
		}
		
		
		System.out.println(cnt+" "+sum);

	}

}
