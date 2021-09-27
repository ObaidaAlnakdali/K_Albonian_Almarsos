// testing

public class MiniDuckSimulator {
	public static void main(String[] args) {
		MallardDuck	myMallard = new MallardDuck();
		FlyBehavior cantFly = () -> System.out.println("I can't fly");
		QuackBehavior squeak = () -> System.out.println("Squeak");
		RubberDuck	rubberDuckie = new RubberDuck(cantFly, squeak);
		DecoyDuck	decoy = new DecoyDuck();

		Duck model = new ModelDuck();

		myMallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();

		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
