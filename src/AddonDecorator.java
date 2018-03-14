// Design followed from http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/
public class AddonDecorator implements ToyCar{
	
	protected ToyCar tempToyCar;
	protected double cost = 0.0;
	protected String description = "";
	protected double addonCost;
	protected String addonDesc;
	
	
	public AddonDecorator(ToyCar newToyCar){
		
		this.tempToyCar = newToyCar;
		
	}
	
	public String getDescription(){
		
		return description;
		
	}
	
	public double getCost(){
		
		System.out.println("Cost of " + description + ": " + cost);
		
		return cost;
		
	}
	
	public void init() {
		System.out.println("Adding " + addonDesc);
		
		cost = tempToyCar.getCost() + addonCost;
		description = tempToyCar.getDescription() + ", " + addonDesc;
	}

}
