package strategy_pattern;

public abstract class Duck {
	FlyBehavior flyBehavior;
	SoundBehavior soundBehavior;
	DisplayBehaviour displayBehaviour;

	public Duck() {
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setSoundBehavior(SoundBehavior qb) {
		soundBehavior = qb;
	}
	
	public void setDisplayBehavior(DisplayBehaviour db) {
		displayBehaviour = db;
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void performSound() {
		soundBehavior.makeSound();
	}
	
	public void performDisplay() {
		displayBehaviour.display();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
