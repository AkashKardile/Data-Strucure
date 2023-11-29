package Array;

import java.util.Scanner;

public class Singnal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the signal");
		String signal=sc.next();
		
		int n=signal.length();
		
		if(n%3!=0)
		{
			System.out.println("Singnal is not valid");
		}
		else
		{
			int cnt=0;
			for(int i=0;i<n;i=i+3)
			{
				if(signal.charAt(i)!='S')
				{
					cnt++;
				}
				if(signal.charAt(i+1)!='O')
				{
					cnt++;
				}
				if(signal.charAt(i+2)!='S')
				{
					cnt++;
				}
			}
			System.out.println(cnt);
		}

	}

}
