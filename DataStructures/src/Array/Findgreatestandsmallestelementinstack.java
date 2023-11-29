package Array;

import java.util.ArrayList;
import java.util.List;

public class Findgreatestandsmallestelementinstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,7,1,7,8,4,5,2};
		
		int n=arr.length;
		
		List<Integer> l=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int next=-1;
			int j=0;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]>arr[i])
				{
					next=arr[j];
					break;
				}
			}
				
				if(next==-1)
				{
					l.add(next);
				}
				else
				{
					next=-1;
					
					for(int k=j+1;k<n;k++)
					{
						if(arr[k]<arr[j])
						{
							next=arr[k];
							break;
						}
					}
					l.add(next);
				}
			
		}
		
		int n1=l.size();
		
		for(int i=0;i<n1;i++)
		{
			System.out.print(l.get(i)+" ");
		}
			
	}

	}


