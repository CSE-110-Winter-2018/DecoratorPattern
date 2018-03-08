// Design followed from http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/
public class Spoiler extends AddonDecorator{
	
	public Spoiler(ToyCar newToyCar) {
		
		super(newToyCar);
		
		System.out.println("Adding Chassis");
		
		System.out.println("Adding Spoiler");
	}
	
	public String getDescription(){
		
		return tempToyCar.getDescription() + ", Spoiler";
		
	}
	
	public double getCost(){
		
		System.out.println("Cost of Spoiler: " + .50);
		
		return tempToyCar.getCost() + .50;
		
	}

}
