// Design followed from http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/
public class AddonDecorator implements ToyCar{
	
	protected ToyCar tempToyCar;
	
	public AddonDecorator(ToyCar newToyCar){
		
		this.tempToyCar = newToyCar;
		
	}
	
	public String getDescription() {
		
		return this.tempToyCar.getDescription();
		
	}

	public double getCost() {
		
		return this.tempToyCar.getCost();
		
	}

}
