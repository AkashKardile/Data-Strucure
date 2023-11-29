package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favouritesinger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		List<Integer> l=new ArrayList<>();
		List<Integer> l1=new ArrayList<>();
		int max=0;
		int ncount=0;
		for(int i=0;i<n;i++)
		{
			int cnt=1;
			if(l.contains(arr[i])==false)
			{
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]==arr[j])
					{
						cnt++;
						l.add(arr[i]);
					}
					
				}
				l1.add(cnt);
				
			}
			
			if(max<=cnt)
			{
				max=cnt;
			}
			
		}
		
		for(int i=0;i<l1.size();i++)
		{
			if(l1.get(i)>=max)
			{
				ncount++;
			}
		}
		System.out.println(ncount);

	}

}
