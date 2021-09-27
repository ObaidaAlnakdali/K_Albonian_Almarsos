public class Whip extends CondimandDecorator {
    Bevarage bevarage;

    public Whip(Bevarage bevarage){
        this.bevarage = bevarage;
    }

    public String getDescription(){
        return bevarage.getDescription()+", Whip";
    }

    public double cost(){
		return bevarage.cost() + .10;
	}
}
