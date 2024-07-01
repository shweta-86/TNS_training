package access.Modifire;

public class Base {
	//Declare default,private,protected & public  method
	
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	//Declare default,private,protected & public method
	
	
			void methodDefault() {
			System.out.println("Default access Base Class");

			System.out.println("Default Variables:" + varDefault);
		
	}
			public void  methodPublic() {
				System.out.println("Public access Base Class");

				System.out.println("Public Variables:" + varPublic);
			
		}
			private void  methodPrivate() {
				System.out.println("Public access Base Class");

				System.out.println("Public Variables:" + varPrivate);
			
		}
			protected void  methodProtected() {
				System.out.println("Public access Base Class");
				System.out.println("Public Variables:" + varProtected);
			
		}
		
		

	

}
