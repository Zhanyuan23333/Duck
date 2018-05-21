
public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		
		System.out.println("the duck can not fly");
	}
	@Override
	public void perform() {
		fly();
	}

}