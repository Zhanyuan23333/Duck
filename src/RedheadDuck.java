
public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		FlyBehavior fBehavior = new FlyWithWings();
		QuackBehavior qBehavior = new Quack();
		super.setFlyBehavior(fBehavior);
		super.setQuackBehavior(qBehavior);
	}
	
	
    public FlyBehavior fBehavior = new FlyWithWings();
	
	public QuackBehavior qBehavior = new Quack();
	
	public void display() {
		System.out.println("i am ºìÍ·Ñ¼");
	}
	

}
