// testing

public class MiniDuckSimulator1 {

	public static void main(String[] args) {
		Duck myMallard = new MallardDuck();
		myMallard.performQuack();
		myMallard.performFly();
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
