package Sorting;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,8,7,6,5,4,3,2,1};
		
		int n=arr.length;
		
		for(int i=1;i<n;i++)
		{
			int pivot=i-1;
			int min=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
					
				}
			}
			if(arr[min]<arr[pivot])
			{
				int temp=arr[min];
				arr[min]=arr[pivot];
				arr[pivot]=temp;
			}
			
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
