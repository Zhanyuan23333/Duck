

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		FlyBehavior fBehavior = new FlyWithWings();
		QuackBehavior qBehavior = new Quack();
		super.setFlyBehavior(fBehavior);
		super.setQuackBehavior(qBehavior);
	}
	
	
	
	public void display() {
		System.out.println("i am ÂÌÍ·Ñ¼");
	}
	

}
