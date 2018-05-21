
public class Text {

	public static void main(String[] args) {
		Duck mallardduck = new MallardDuck();
		mallardduck.display();
		mallardduck.performFly();
		mallardduck.performQuack();
		FlyBehavior flyBehavior = new FlyNoWay();
		mallardduck.setFlyBehavior(flyBehavior);
		mallardduck.performFly();
	}

}
