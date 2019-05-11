package strategy_pattern;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new CanNotFly();
		soundBehavior = new WaakSound();
		displayBehaviour = new RubberDisplay();
	}

}
