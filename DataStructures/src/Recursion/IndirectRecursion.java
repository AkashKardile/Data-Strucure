package Recursion;

public class IndirectRecursion {
	
	public static void show(int n)
	{
		if(n>0)
		{
			System.out.print(n+" ");
			display(n-1);
		}
	}
	
	public static void display(int n)
	{
		if(n>1)
		{
			System.out.print(n+" ");
			show(n/2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show(10);

	}

}
