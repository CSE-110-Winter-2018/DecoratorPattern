// Design followed from http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/
public class Spoiler extends AddonDecorator{
	
	public Spoiler(ToyCar newToyCar) {
		
		// Build the base
		super(newToyCar);
		
		// Define new features
		addonDesc = "Spoiler"; 
		addonCost = 0.50;
		
		// Add them to base
		init();

	}

}
