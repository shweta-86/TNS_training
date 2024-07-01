package access.Modifire;

public class Person {
	
	private String personName;
	private int personAge;
	private String personcity;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersoncity() {
		return personcity;
	}
	public void setPersoncity(String personcity) {
		this.personcity = personcity;
	}
		
		public Person() {
			System.out.println();
		}	
	
		public Person(String personName, int personAge, String personcity) {
			System.out.println();
	
			this.personName = personName;
			this.personAge = personAge;
			this.personcity = personcity;
		}
	
	

}
