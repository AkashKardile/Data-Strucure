package Array;

public class Subtractionoftwoarraybybit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		int b=2;
		
		if(a==0)
        {
            System.out.println(-b);
        }
        if(b==0)
        {
        	 System.out.println(a);
        }

        while (b != 0) {
		int carry = (~a) & b;
		a = a ^ b;
		b = carry << 1;
        }
        
        System.out.println(a);
        

	}

}
