package Array;

import java.util.Scanner;

public class Insertatbeginning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int arr[]=new int[size+1];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=size;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=12;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
