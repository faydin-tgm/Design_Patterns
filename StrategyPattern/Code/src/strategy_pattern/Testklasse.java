package strategy_pattern;

public class Testklasse {
	public static void main(String[] args) {
		Duck redhead = new RedheadDuck();
		redhead.performDisplay();
		redhead.performSound();
		redhead.performFly();
	}
}