package Sorting;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,8,7,6,5,4,3,2,1};
		
		int n=arr.length;
		
		
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
