package Sorting;

public class Quicksort {
	
	public static void display(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int partition(int arr[],int low,int high)
	{
		int pivot=arr[(low+high)/2];
		
		while(low<=high)
		{
			while(arr[low]<pivot)
			{
				low++;
			}
			while(arr[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
		return low;
	}
	
	public static void quicksort(int arr[],int low,int high)
	{
		int res=partition(arr, low, high);
		if(low<res-1)
		{
			quicksort(arr, low, res-1);
		}
		
		if(res<high)
		{
			quicksort(arr, res, high);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,8,7,6,5,4,3,2,1};
		
		int n=arr.length;
		
		quicksort(arr, 0, n-1);
		display(arr, n);
		

	}

}
