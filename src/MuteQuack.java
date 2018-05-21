
public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("the duck can not quack.");
		
	}

	@Override
	public void perform() {
		quack();
		
	}

}
