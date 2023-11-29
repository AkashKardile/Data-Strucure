package Searching.TernarySearch;

import java.util.Arrays;

public class Recursion {
	
	public static int show(int arr[],int key,int low,int high)
	{
		while(low<=high)
		{
			int mid1=low+(high-low)/3;
			
			int mid2=high-(high-low)/3;
			
			if(key==arr[mid1])
			{
				return mid1;
			}
			else if(key==arr[mid2])
			{
				return mid2;
			}
			else if(key<arr[mid1])
			{
				return show(arr, key, low, mid1-1);
			}
			else if(key>arr[mid2])
			{
				return show(arr, key, mid2+1, high);
			}
			else
			{
				return show(arr, key, mid1+1, mid2-1);
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
		int key=9;
		
		int result=show(arr, key, low, high);
		
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
