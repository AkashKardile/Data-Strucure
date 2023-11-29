package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Findthesmallestfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,2,3,5,1,4,1,3,1};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		int n=arr.length;
		Arrays.sort(arr);
		int number=0;
		int res=Integer.MAX_VALUE;
		List<Integer> l=new ArrayList<>();
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
			
			if(cnt==k)
			{
				res=Math.min(res,arr[i]);
				//number=arr[i];
				//break;
			}
			}
		}
		
		System.out.println(res);

	}

}
