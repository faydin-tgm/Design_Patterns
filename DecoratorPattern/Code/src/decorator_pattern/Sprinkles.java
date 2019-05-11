package decorator_pattern;

public class Sprinkles extends IngredientDecorator {
	IceCream iceCream;
	
	public Sprinkles(IceCream iceCream){
		this.iceCream = iceCream;
	}

	public double cost(){
		return 0.05 + iceCream.cost();
	}

	public String getDescription(){
		return iceCream.getDescription() + ", Sprinkles";
	}
}