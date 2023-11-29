package Sorting;

public class Mergesort {
	
	public static void display(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void ms(int arr[],int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			ms(arr,low,mid);
			ms(arr,mid+1,high);
			merge(arr,low,high,mid);
		}
	}
	
	public static void merge(int arr[],int low,int high,int mid)
	{
		int i=low;
		int j=mid+1;
		int k=low;
		int brr[]=new int[arr.length];
		
		while(i<=mid && j<=high)
		{
			if(arr[i]<arr[j])
			{
				brr[k]=arr[i];
				i++;
			}
			else
			{
				brr[k]=arr[j];
				j++;
			}
			k++;
		}
		if(i>mid)
		{
			while(j<=high)
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
		}
		if(j>high)
		{
			while(i<=mid)
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
		}
		
		for(int p=low;p<=high;p++)
		{
			arr[p]=brr[p];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,8,7,6,5,4,3,2,1};
		
		int n=arr.length;
		
		ms(arr, 0, n-1);
		display(arr, n);

	}

}
