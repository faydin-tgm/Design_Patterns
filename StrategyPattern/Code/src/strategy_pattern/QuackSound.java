package strategy_pattern;

public class QuackSound implements SoundBehavior {
	@Override
	public void makeSound() {
		System.out.println("Quack");
	}
}
