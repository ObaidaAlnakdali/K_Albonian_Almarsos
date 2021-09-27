public class SimpleSubject implements Subject {
    private ArrayList<Observable> observers;
    private int value = 0;
    public SimpleSubject(){
        observers = new ArrayList<Observable>();
    }

    public void registerObserver(Observable o){

    }

    public void removeObserver(Observable o){
        
    }

    public void notifyObserver(){
        for (Observer observer : observers){
            observer.update(value);
        }
    }

    public void setValue(int value){
        this.value = value;
        notifyObserver();
    }
}
