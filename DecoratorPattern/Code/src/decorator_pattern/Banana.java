package decorator_pattern;

public class Banana extends IceCream {
	
	public Banana(){
		description = "Banana";
	}

	public double cost(){
		return 0.99;
	}
}

