package shwetaa;

public class Looping {
	public static void main(String[] args) {
		
//-----------For loop---------------
		
		/*for(int i=1; i<=10; i++) {
			System.out.println("Value of i="+i);
		}
		*/
		
//-----------While loop--------------
		
		/*int i=99;
		while (i<=100)
		
		{
			System.out.println(i);
			i++;
		}
		*/
		
//-----------Do While loop-------------
		
		/*int i=11;
		do {
			System.out.println(i);
			i++;
		}
		while (i<=1);
		*/
		
//-----------For Each loop--------------
		
		/*int a[] = {10,20,30,40,50};
		
    // For integer array
		for(int i : a) {
			System.out.println(i);
		}
		char ch[] = {'a','b','c','d'};
		for (char c : ch) {
			System.out.println(c);
		}
 		
		String s1[] = {"Java", "Program", "Learning"};
		for (String s: s1) {
			System.out.println(s);
		}
	   */
		
//-------------Nested For loops------------
		
      //program to print the multiplication tables in given range
		
		int beg=10;
		int end=20;
		for(int i=beg; i<=end; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i + "*" +j + "=" +i*j);
			}

			
		}
		
	}

}
