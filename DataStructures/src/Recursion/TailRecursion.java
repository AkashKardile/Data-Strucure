package Recursion;

public class TailRecursion {
	public static void show(int n)
	{
		if(n>0)
		{
			System.out.print(n+" ");
			show(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		show(n);

	}

}
