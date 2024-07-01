package access.Modifire;

public class Exexutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//accessing same pacakage
		Base b1 = new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		b1.varDefault = 11;
		b1.methodDefault();
		
		//Private member cant be accessible
		
		//b1.var
		//b1.method
		
		//Protected
		
		b1.varProtected = 21;
		b1.methodProtected();
		
		//Public
		
		b1.varPublic = 345;
		b1.methodPublic();
		
		//instance of operator
		
		System.out.println(b1 instanceof Base);  //returns true
		
		Person p = new Person();
		System.out.println();
		
		


	}

}
