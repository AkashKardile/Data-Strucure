package Searching.Binarysearch;

import java.util.Arrays;

public class Iteration {
	
	public static int show(int arr[],int low,int high,int key)
	{
		
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key<arr[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {8,1,2,3,4};
		Arrays.sort(arr);
		int low=0;
		int high=arr.length-1;
		int key=3;
		
		int result=show(arr, low, high, key);
		
		if(result==-1)
		{
			System.out.println("Element is not present");
		}
		else
		{
			System.out.println(result);
		}

	}

}
