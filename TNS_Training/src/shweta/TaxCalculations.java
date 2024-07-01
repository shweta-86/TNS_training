package shweta;

public class TaxCalculations {
	// functions to calculate tax
	public void calculateTax(IncomeTax navin) {
		if (navin.getAge()>65 || navin.getGender().equalsIgnoreCase("female")) {
			navin.setTax(0);
			System.out.println("Tax not applicable");
		}
		else {
			if (navin.getIncome() <=160000) {
				navin.setTax(0);
			}
			else if (navin.getIncome()>160000 && navin.getIncome()<=500000)
				navin.setTax(navin.getIncome() - 160000*10/100);
		}
			
			if (navin.getIncome()>500000 && navin.getIncome()<=800000)
				navin.setTax(navin.getIncome() - 500000*20/100 + 34000);
			else {
				navin.setTax(navin.getIncome() - 800000*20/100 + 94000);

				
			}

		
	}
}
	
	