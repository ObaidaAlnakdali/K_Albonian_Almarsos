public interface Duck {
    public void quack();

    public void fly();
}

public class MallarDuck extends Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}

public interface Turkey {
    public void gobble();

    public void fly();
}

public class WildTurkey extends Turkey {
    public void gobble() {
        System.out.println("Gobble");
    }

    public void fly() {
        System.out.println("I'm flying Wild Turkey");
    }
}

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}

public class DuckAdapter implements Turkey {
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        if (rand.nextInt(5) == 0) {
            duck.fly();
        }
    }
}

public class Ducktest {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        testDuck(duck);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
