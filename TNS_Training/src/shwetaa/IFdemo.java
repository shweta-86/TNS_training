package shwetaa;

public class IFdemo {

	public static void main(String[] args) {
		
		/*int x=5;
		if(x!=5)
			System.out.println("Value of x is not 5");
		
		
		
	//If Else loop
		
		/*int age= 10;
		if (age>=18) 
		{
			System.out.println("Yoo are elgibile for voting");
		}
		else {
			System.out.println("Sorry! you are not eligible");

			*/
			//Decision making operator
			
			/*int x1 = 8;
			int y = 7;
			int a=10;
			int b=11;
			if (x1>=y) {
				System.out.println("true");
			}
			else {
				System.out.println("False");
			}
			//10<11   10==11
		}
	*/
		
		
		// Nested if 
		int a=10;
		int b=20;
		int c=5;
		System.out.println("The Largest No is:");
		if (a>b)
		{
			if (a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
			else {
				if (c>b)
					System.out.println(c);
				else
					System.out.println(b);
			}
		
		

	}

}
