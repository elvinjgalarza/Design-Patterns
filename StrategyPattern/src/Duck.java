
public class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	// more
	
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
}
