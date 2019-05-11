package decorator_pattern;

public abstract class IceCream {
	public String description = "IceCream not defined";
	public abstract double cost();
	public String getDescription(){
		return description;
	}
}
