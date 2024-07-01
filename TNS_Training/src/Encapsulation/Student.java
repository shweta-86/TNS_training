package Encapsulation;

public class Student {
	// Encapsulating parameters
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

public class EncapsulationDemo {
		public static void main (String[] args) {
			Student s= new Student();
			s.setName("Shweta");
			s.setAge(22);
			
			System.out.println("Name of Student: " + s.getName());
			System.out.println("Name of Student: " + s.getAge());


		}
		
		
	}
}
	


