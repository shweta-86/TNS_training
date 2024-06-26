package shwetaa;

public class OperatorDay4 {

	public static void main(String[] args) {
	 
		
		int a=10;
		int b=20;
		System.out.println("a and b value before the opearor:" +a +' ' +b);
		
		++a;   //11
		
		int c= ++a + b + a--; 
		System.out.println("c value after the operator:" +c);
		
		//44 11 20
		int d = c++ + a + b--;
		System.out.println("d value after the operator:" +d);


	}
}	