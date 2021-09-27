public class SimpleObserver implements Observer {
    private int value;
    private Subject simpleSubject;
    public SimpleObserver(Subject simpleSubject){
        this.simpleSubject = simpleSubject;
        simpleSubject.registerObserver(this);
    }

    public void update(int vlue){
        this.value = vlue;
        display();
    }

    public void dispose(){
        System.out.println("Value:", value);
    }
}
