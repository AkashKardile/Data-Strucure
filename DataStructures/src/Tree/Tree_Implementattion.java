package Tree;

import java.util.Scanner;

public class Tree_Implementattion {
	
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

	
	public static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
	
	public static void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		
	}
	
	public static void postorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=create();
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Preorder");
			System.out.println("2. PostOrder");
			System.out.println("3. Inorder");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				preorder(root);
				break;
			case 2:
				postorder(root);
				break;
			case 3:
				inorder(root);
				break;
			}
		}

	}

}
