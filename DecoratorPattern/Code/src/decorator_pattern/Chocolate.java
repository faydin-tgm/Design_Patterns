package decorator_pattern;
 
public class Chocolate extends IngredientDecorator {
	IceCream iceCream;
	
	public Chocolate(IceCream iceCream){
		this.iceCream = iceCream;
	}
	
	public double cost(){
		return 0.20 + iceCream.cost();
	}
	
	public String getDescription(){
		return iceCream.getDescription() + ", Chocolate";
	}
}