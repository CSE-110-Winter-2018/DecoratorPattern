// Design followed from http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/
public class PlainToyCar implements ToyCar {
	
	public String getDescription() {
		
		return "Chassis";
	
	}

	public double getCost() {

		System.out.println("Cost of Chassis: " + 4.00);
		
		return 4.00;
	
	}
}
