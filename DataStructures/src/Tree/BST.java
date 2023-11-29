package Tree;

public class BST {
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
	
	static Node root=null;
	public static Node insert(Node root,int val)
	{
		if(root==null)
		{
			root=new Node(val);
		}
			
		else if(root.data>val)
		{
			root.left=insert(root.left, val);
		}
		else {
			root.right=insert(root.right, val);
		}
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
	
	public static boolean search(Node root,int key)
	{
		if(root==null)
		{
			return false;
		}
			if(key==root.data)
		{
			return true;
		}
		else if(key<root.data)
		{
			return search(root.left, key);
			
		}
		else
		{
			return search(root.right, key);
		}
		
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={3,1,4,6,13,0,45};
		
		for(int i=0;i<arr.length;i++)
		{
			root=insert(root, arr[i]);
		}
		
		//inorder(root);
		System.out.println();
		
		if(search(root, 0))
		{
			System.out.println("Key is present");
		}
		else {
			System.out.println("Key is not present");
		}

	}

}
