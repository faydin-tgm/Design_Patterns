package strategy_pattern;

public class CanNotFly implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
