
public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		FlyBehavior fBehavior = new FlyNoWay();
		QuackBehavior qBehavior = new MuteQuack();
		super.setFlyBehavior(fBehavior);
		super.setQuackBehavior(qBehavior);
	}
	

    public FlyBehavior fBehavior = new FlyNoWay();
	
	public QuackBehavior qBehavior = new MuteQuack();
	
	public void display() {
		System.out.println("i am ÓÕ¶üÑ¼");
	}

}
