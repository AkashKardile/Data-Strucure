package Array;

import java.util.Scanner;

public class SortthestringArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String name[]=new String[5];
		
		for(int i=0;i<name.length;i++)
		{
			name[i]=sc.next();
		}
		
		for(int i=1;i<name.length;i++)
		{
			for(int j=0;j<name.length-i;j++)
			{
				if(name[j].compareToIgnoreCase(name[j+1])>0)
				{
					String str=name[j];
					name[j]=name[j+1];
					name[j+1]=str;
				}
			}
		}
		

		for(int i=0;i<name.length;i++)
		{
			System.out.print(name[i]+" ");
		}

	}

}
