package Recursion;

public class FSeriesMethod2 {
	
	public static int series(int n)
	{
		if(n<=1)
		{
			return n;
		}
		
		return series(n-1)+series(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(series(i)+" ");
		}

	}

}
