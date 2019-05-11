package strategy_pattern;

public class FlyVeryFast implements FlyBehavior {
	public void fly() {
		System.out.println("The duck prepared itself for flying. The very next second, the duck was too far away to be seen by the naked eye.");
	}
}
