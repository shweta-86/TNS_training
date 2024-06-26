package shwetaa;

public class SwitchdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*char x= 'l';
		switch (x)
		{
		case 'l':
		case 'L':
			System.out.println(x + "is a leader");
			break;
		case 'd':
		case 'D':
			System.out.println(x + "is a Digital");
			break;
		case 'w':
		case 'W':
			System.out.println(x + "is a aaaaa");
			break;
		case 's':
		case 'S':
			System.out.println(x + "is a fdhjshjs");
			break;
		}
		*/
		
//-------------Break Sttement------------
		
		/*for (int i = 5; i<10; i++) {
			if (i==5)
				//break;
			System.out.println(i);
			
			System.out.println("Hello");
			break;

		}
		
*/
		
//---------------Continue-------------
		for (int k=5; k<15; k++) {
			
			//odd no are skipped
			
			if (k%2 !=0)
				continue;
			//even no are printed
			System.out.println(k + "");
		}
		
		
      
		

	}

}
