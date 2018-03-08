// Design followed from http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/
public class VeeEngine extends AddonDecorator{
	
	public VeeEngine(ToyCar newToyCar) {
		super(newToyCar);
		
		System.out.println("Adding VeeEngine");
	}

	public String getDescription(){
		
		return tempToyCar.getDescription() + ", VeeEngine";
		
	}
	
	public double getCost(){
		
		System.out.println("Cost of VeeEngine: " + .35);
		
		return tempToyCar.getCost() + .35;
		
	}
}
