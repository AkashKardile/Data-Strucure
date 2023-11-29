package Searching.Binarysearch;

import java.util.Arrays;

public class Recursion {
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
				return show(arr, low, mid-1, key);
			}
			else
			{
				return show(arr, mid+1, high, key);
			}
		}
		return -1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7,8};
		Arrays.sort(arr);
		int low=0;
		int high=arr.length-1;
		int key=6;
		
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
