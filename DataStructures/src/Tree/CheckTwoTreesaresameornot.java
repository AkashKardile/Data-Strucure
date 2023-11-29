package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class CheckTwoTreesaresameornot {
	static class Node
	{
		int data;
		
		Node left;
		
		Node right;
		
		Node(int data)
		{
			this.data=data;
		}
	}

	public static Node create()
	{
		Node P=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		if(data==-1)
		{
			return null;
		}
		
		P=new Node(data);
		
		System.out.println("Enter the left for : "+P.data);
		P.left=create();
		System.out.println("Enter the Right for: "+P.data);
		P.right=create();
		
		return P;
		
		
	}
	
	public static Node create1()
	{
		Node Q=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		if(data==-1)
		{
			return null;
		}
		
		Q=new Node(data);
		
		System.out.println("Enter the left for : "+Q.data);
		Q.left=create();
		System.out.println("Enter the Right for: "+Q.data);
		Q.right=create();
		
		return Q;
		
		
	}
	
	
	public static void inorder1(Node p,List<Integer> result)
    {
        if(p==null)
        {
            return;
        }

        inorder1(p.left,result);
        result.add(p.data);
        inorder1(p.right,result);
    }

      public static void inorder2(Node q,List<Integer> result1)
    {
        if(q==null)
        {
            return;
        }

        inorder2(q.left,result1);
        result1.add(q.data);
        inorder2(q.right,result1);
    }
    public static boolean isSameTree(Node p, Node q) {

        List<Integer> result=new ArrayList<>();
        List<Integer> result1=new ArrayList<>();

        inorder1(p,result);
        inorder2(q,result1);

        int cnt=0;

        if(result.size()==result1.size())
        {
            for(int i=0;i<result.size();i++)
            {
                if(result.get(i)==result1.get(i))
                {
                    cnt++;
                }
            }

            if(cnt==result.size())
            {
                return true;
            }
        }

        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node p=create();
		Node q=create1();
		
		System.out.println(isSameTree(p, q));
		
		

	}

}
