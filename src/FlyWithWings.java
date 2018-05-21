
public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("the duck can fly with wings.");
	}
	@Override
	public void perform() {
		fly();
	}

}
