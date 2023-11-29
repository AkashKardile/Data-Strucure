package Sorting;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,8,7,6,5,4,3,2,1};
		
		int n=arr.length;
		
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int j=i-1;
			
			while(j>=0)
			{
				if(arr[j]>temp)
				{
					arr[j+1]=arr[j];
					j--;
				}
			}
			j++;
			arr[j]=temp;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
