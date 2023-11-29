package Recursion;

public class TreeRecursion {
	public static void show(int n)
	{
		if(n>0)
		{
			show(n-1);
			System.out.print(n+" ");
			show(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show(3);

	}

}
