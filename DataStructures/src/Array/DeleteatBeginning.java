package Array;

public class DeleteatBeginning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		
		int n=arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		n--;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
