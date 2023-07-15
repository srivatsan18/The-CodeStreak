public class ConcreteObserver implements Observer{

    private final ConcreateSubject subject;
    String observerName;

    public ConcreteObserver (ConcreateSubject subject) {
        this.subject = subject;
    }

    @Override
    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public String getObserverName(){
        return observerName;
    }


    @Override
    public void update() {
        int existingState = subject.existingState;
       int state = subject.getState();
       String observerName = this.getObserverName();
        System.out.println("Changed subject is : "+ state + " from " + existingState +  " and " + observerName + " is notified!");
    }
}
