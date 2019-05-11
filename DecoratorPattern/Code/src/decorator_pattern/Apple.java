package decorator_pattern;

public class Apple extends IceCream {
	
	public Apple(){
		description = "Apple";
	}
	
	public double cost(){
		return 1.05;
	}
}
