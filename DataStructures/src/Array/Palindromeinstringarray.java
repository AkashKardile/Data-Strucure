package Array;

public class Palindromeinstringarray {
	
	public static boolean palindrome(String str)
	{
		String str1="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		
		if(str.equals(str1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]= {"nitin","a","radar","plane"};
		
		for(int i=0;i<str.length;i++)
		{
			if(palindrome(str[i]))
			{
				System.out.print(str[i]+" ");
			}
		}

	}

}
