public class StartTest {
    public static void main(String[] args) {
        Bevarage bevarage = new DarkRoast();

        bevarage = new Whip(bevarage);
        bevarage = new Milk(bevarage);

        System.out.println(bevarage.getDescription() + " " + bevarage.cost());
    }
}
