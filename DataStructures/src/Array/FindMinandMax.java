package Array;

import java.util.Arrays;

public class FindMinandMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,7,1,5,8};
		Arrays.sort(arr);
		int min=0;
		int max=0;
		
		int n=arr.length;
		
		int k=n-(n-1);
		
		for(int i=0;i<n-1;i++)
		{
			min=min+arr[i];
		}
		
		for(int i=n-1;i>=k;i--)
		{
			max=max+arr[i];
		}
		
		System.out.println(min+" "+max);

	}

}
