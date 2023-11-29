package Recursion;

public class Sumofnumbers {
	public static int sum(int n)
	{
		int sums=0;
		if(n>0)
		{
			sums=n+sum(n-1);
			
			
		}
		
		return sums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(0));

	}

}
