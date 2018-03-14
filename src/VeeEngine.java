// Design followed from http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/
public class VeeEngine extends AddonDecorator{
	
	public VeeEngine(ToyCar newToyCar) {
		
		// Build the base
		super(newToyCar);
		
		// Define new features
		addonDesc = "VeeEngine";
		addonCost = 0.35;
		
		// Add them to base
		init();
	}
}
