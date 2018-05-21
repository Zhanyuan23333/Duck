
public class RubberDuck extends Duck {
	
	public RubberDuck() {
		FlyBehavior fBehavior = new FlyNoWay();
		QuackBehavior qBehavior = new Squack();
		super.setFlyBehavior(fBehavior);
		super.setQuackBehavior(qBehavior);
	}
	
    public FlyBehavior fBehavior = new FlyNoWay();
	
	public QuackBehavior qBehavior = new Squack();
	
	public void display() {
		System.out.println("i am À‹Ω∫—º");
	}

}
