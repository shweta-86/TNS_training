package Constructor;


import java.util.Scanner;


public class Customer {
	
	private String custname;
	private int custId;
	private String custcity;
	public Customer() {
		System.out.println("Defualt constructor");
	}
	
	public Customer(String custname, int custId, String custcity) {
		super();
		this.custname = custname;
		this.custId = custId;
		this.custcity = custcity;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustcity() {
		return custcity;
	}

	public void setCustcity(String custcity) {
		this.custcity = custcity;
	}

	@Override
	public String toString() {
		return "Constructordemo [custname=" + custname + ", custId=" + custId + ", custcity=" + custcity + "]";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("enter id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter cust name");
		name=sc.nextLine();
		System.out.println("enter cust city");
		city=sc.nextLine();
		System.out.println(" ");
		Customer c1= new Customer();
		c1.setCustcity(city);
		c1.setCustname(name);
		c1.setCustId(id);
		System.out.println(c1);
		sc.close();
		Customer c2= new Customer(name,id,city);
		System.out.println(c2);
		
		
				
	}

}


