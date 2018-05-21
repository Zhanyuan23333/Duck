
public class Squack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("zhi zhi zhi");
		
	}

	@Override
	public void perform() {
		quack();
		
	}
		

}
