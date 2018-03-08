// Design followed from http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/
public class ToyCarMaker {
	
	public static void main(String[] args) {
		ToyCar basicToyCar = new VeeEngine(new Spoiler(new PlainToyCar()));
		
		System.out.println("Car Components: " + basicToyCar.getDescription());
		
		System.out.println("Price: " + basicToyCar.getCost());
	}
	
}
