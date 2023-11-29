package Recursion;

public class FiboniciiSeries {
	
	static int a=0;
	
	static int b=1;
	
	public static void series(int n)
	{
		if(n>0)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
			series(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(a+" "+b+" ");
		int n=7;
		series(n-2);

	}

}
