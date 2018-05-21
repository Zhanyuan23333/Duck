
public class Duck {
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public void swim() {
		System.out.println("the duck can swim.");
	}
	public void display() {}
	public void performQuack() {
		quackBehavior.perform();
	}
	public void performFly() {
		flyBehavior.perform();
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	

}
