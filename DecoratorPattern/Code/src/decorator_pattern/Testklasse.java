package decorator_pattern;

public class Testklasse {
	public static void main(String[] args){
		IceCream testIceCream = new Apple();
		testIceCream = new Chocolate(testIceCream);
		testIceCream = new Sprinkles(testIceCream);
		System.out.println("Your order: " + testIceCream.getDescription() 
				+ " €" + testIceCream.cost());
	}
}