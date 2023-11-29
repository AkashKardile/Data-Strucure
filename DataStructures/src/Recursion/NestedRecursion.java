package Recursion;

public class NestedRecursion {
	public static int show(int n)
	{
		if(n>100)
		{
			return n-9;
		}
		else
		{
			return show(show(n+10));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=show(100);
		System.out.println(result);

	}

}
