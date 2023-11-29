package Array;

public class stockspam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {100,80,70,60,65,75,85};
		
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			int cnt=1;
			for(int j=0;j<=i;j++)
			{
				if(arr[i]>arr[j])
				{
					cnt++;
				}
			}
			System.out.print(cnt+" ");
		}
				

	}

}
