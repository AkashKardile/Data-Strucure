package Recursion;

public class Numbers {

	public static void  numbers1_50(int n)
	{
		if(n>0)
		{
			numbers1_50(n-1);
			System.out.print(n+" ");
			
		}
		
		
	}
	
	public static void numbers50_1(int n)
	{
		
		if(n>0)
		{
			
			System.out.print(n+" ");
			numbers50_1(n-1);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numbers1_50(50);
		System.out.println();
		numbers50_1(50);
		

	}

}
