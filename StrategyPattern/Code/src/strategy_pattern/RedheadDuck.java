package strategy_pattern;

public class RedheadDuck extends Duck {
 
	public RedheadDuck() {
		flyBehavior = new FlyVeryFast();
		soundBehavior = new WaakSound();
		displayBehaviour = new RedheadDisplay();
	}
}
