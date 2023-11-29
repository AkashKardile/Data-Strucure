package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tofindtheduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		
		int arr[]=new int[n+1];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		
//		Arrays.sort(arr);
//		
//		for(int i=0;i<arr.length-1;i++)
//		{
//			if(arr[i]==arr[i+1])
//			{
//				System.out.println(arr[i]);
//			}
//		}
		
		List<Integer> l=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!l.contains(arr[i]))
			{
				l.add(arr[i]);
			}
			else
			{
				System.out.println(arr[i]);
			}
		}
	}

}
