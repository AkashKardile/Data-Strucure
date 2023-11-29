package Array;

public class Finftheanagraminarary {
	public static String sort(String name)
	{
		
		
		char c1[]=name.toCharArray();
		for(int i=1;i<name.length();i++)
		{
			for(int j=0;j<name.length()-i;j++)
			{
				if(c1[j]>c1[j+1])
				{
					char c2=c1[j];
					c1[j]=c1[j+1];
					c1[j+1]=c2;
				}
			}
		}
		
		String str="";
		for(int i=0;i<c1.length;i++)
		{
			str=str+c1[i];
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"listen","bat","run","net","sleep"};
		String str1[]= {"tab","ten","silent","walk","laugh"};
		
		String str2[]=new String[str.length];
		String str3[]=new String[str1.length];
		for(int i=0;i<str.length;i++)
		{
			str2[i]=sort(str[i]);
		}
		
		for(int i=0;i<str1.length;i++)
		{
			str3[i]=sort(str1[i]);
		}
		
		for(int i=0;i<str2.length;i++)
		{
			for(int j=0;j<str3.length;j++)
			{
				if(str2[i].equalsIgnoreCase(str3[j]))
				{
					System.out.print(str[i]+" ");
				}
			}
		}
		
		

	}

}
