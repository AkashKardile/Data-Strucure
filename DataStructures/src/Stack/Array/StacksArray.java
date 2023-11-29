package Stack.Array;

import java.util.Scanner;

public class StacksArray {
	
	static int N=10;
	
  static int stack[]=new int[N];
  
  static int top=-1;
  
  public static void push()
  {
	  if(top==N-1)
	  {
		  System.out.println("Stack Overflow");
	  }
	  else
	  {
		  
		  
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter the data");
		  //int data=sc.nextInt();
		  for(int i=0;i<N;i++)
		  {
			  
		  top++;
		  stack[top]=sc.nextInt();
		  }
		  
		  System.out.println("Data inserted successfully");
		}
  }
  
  
  public static void pop()
  {
	  if(top==-1)
	  {
		  System.out.println("Stack underflow");
	  }
	  else
	  {
		  top--;
		  System.out.println("Data deleted successfully");
	  }
  }
  
  public static void peek()
  {
	  if(top==-1)
	  {
		  System.out.println("Stack underflow");
	  }
	  else
	  {
		  System.out.println(stack[top]);
	  }
  }
 public static void isempty()
 {
	 if(top==-1)
	 {
		 System.out.println("Stack is empty");
	 }
	 else
	 {
		 System.out.println("Stack is not empty");
	 }
 }
 
  public static void display()
  {
	  
	  for(int i=top;i>=0;i--)
	  {
		  System.out.print(stack[i]+" ");
	  }
	  System.out.println();
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("1. Push");
			System.out.println("2. pop");
			System.out.println("3. Peek");
			System.out.println("4. isempty");
			System.out.println("5. Display");
			
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				peek();
				break;
			case 4:
				isempty();
				break;
			case 5:
				display();
				break;
			}
		}

	}

}
