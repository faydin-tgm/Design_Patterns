package strategy_pattern;

public class MallardDuck extends Duck {

	public MallardDuck() {
		soundBehavior = new WaakSound();
		flyBehavior = new FlyWithWings();
		displayBehaviour = new MallardDisplay();
	}
}
