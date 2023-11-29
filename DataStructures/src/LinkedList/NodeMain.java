package LinkedList;

import java.util.Scanner;

public class NodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Insert at end: ");
			System.out.println("2. Insert at beginning:");
			System.out.println("3. Insert at position");
			System.out.println("4. Delete at  end");
			System.out.println("5. Delete at beginning:");
			System.out.println("6. Delete at position");
			System.out.println("7.Insertion at end tail");
			System.out.println("8. Searching");
			System.out.println("9. Display");
			
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				Node.insertatend();
				break;
			case 2:
				Node.insertatbeginning();
				break;
			case 3:
				Node.insertatposition();
				break;
			case 4:
				Node.deleteatend();
				break;
			case 5:
				
				Node.deleteatbeginning();
				break;
			case 6:
				Node.deleteatposition();
				break;
			case 7:
				Node.insertatendtail();
				break;
			case 8:
				Node.search();
				break;
			case 9:
				Node.display();
				break;
			default:
				System.out.println("Please enter valid choice");
				break;
				
			}
			
		}

	}

}
