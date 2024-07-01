package shweta;

public class OopsConceptsDemo {
	
		private int age;
		private String name;
		private int serialnum;
		
		
		
		
		
		public int getAge() {
			return age;
		}





		public void setAge(int age) {
			this.age = age;
		}





		public String getName() {
			return name;
		}





		public void setName(String name) {
			this.name = name;
		}





		public int getSerialnum() {
			return serialnum;
		}





		public void setSerialnum(int serialnum) {
			this.serialnum = serialnum;
		}





		@Override
		public String toString() {
			return "OopsConceptsDemo [age=" + age + ", name=" + name + ", serialnum=" + serialnum + "]";
		}





		public static void main(String[] args) {
			OopsConceptsDemo obj=new OopsConceptsDemo();
			obj.setName("ansf");
			obj.setAge(11);
			obj.setSerialnum(23);
			System.out.println(obj);
		}

	}


