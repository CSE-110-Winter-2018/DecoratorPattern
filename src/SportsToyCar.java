// Design followed from http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/
public class SportsToyCar implements ToyCar{
	
	private String description = "VeeEngine, CarbonFiberBody, Spoiler";
	private double cost = 10.50;
	
	public void setDescription(String newDescription) {
		
		description = newDescription;
		
	}

	public String getDescription() {
	
		return description;
		
	}

	public void setCost(double newCost) {
		
		cost = newCost;
		
	}

	public double getCost() {
		
		return cost;
		
	}
}
