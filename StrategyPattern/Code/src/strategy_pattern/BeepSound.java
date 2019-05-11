package strategy_pattern;

public class BeepSound implements SoundBehavior {
	public void makeSound() {
		System.out.println("Beep");
	}
}
