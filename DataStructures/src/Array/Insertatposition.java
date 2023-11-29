package Array;

import java.util.Scanner;

public class Insertatposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int arr[]=new int[size+1];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int position=3;
		
		
		
		for(int i=size;i>position-1;i--)
		{
			arr[i]=arr[i-1];
		}
		
		arr[position-1]=12;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
