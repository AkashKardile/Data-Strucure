package Tree;

import java.util.Scanner;



public class LeafofTree {
	
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
		Node root=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		if(data==-1)
		{
			return null;
		}
		
		root=new Node(data);
		
		System.out.println("Enter the left for : "+root.data);
		root.left=create();
		System.out.println("Enter the Right for: "+root.data);
		root.right=create();
		
		return root;
		
		
	}
	
	
	public static void leafoftree(Node root)
	{
		if(root==null)
		{
			return;
		}
		if(root.left==null && root.right==null)
		{
			System.out.print(root.data+" ");
			return;
		}
		
		leafoftree(root.left);
		leafoftree(root.right);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root=create();
		
		leafoftree(root);

	}

}
