package Array;

public class Gameofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {-1,-2,4,3,-1,2,3};
		
		int n=arr.length;
		
		int brr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			int cnt=0;
			int j=0;
			for(j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					cnt=1;
					
					break;
				}
				
			}
			if(cnt==1)
			{
				brr[i]=arr[j];
				
			}
			else
			{
				brr[i]=-1;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(brr[i]+" ");	
		}
		System.out.println();
		
		int stack[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((arr[j]==brr[i] || brr[i]==-1) && j>=i)
				{
					int cnt=0;
					
					int k=0;
					
					for(k=j+1;k<n;k++)
					{
						if(arr[k]<brr[i])
						{
							cnt=1;
							break;
						}
						
					}
					if(cnt==1)
					{
						stack[i]=arr[k];
					}
					else
					{
						stack[i]=-1;
					}
					break;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(stack[i]+" ");
		}

	}

}
