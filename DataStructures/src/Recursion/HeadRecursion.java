package Recursion;

public class HeadRecursion {
	
	public static void show(int n)
	{
		if(n>0)
		{
			show(n-1);
			System.out.print(n+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		show(n);

	}

}
