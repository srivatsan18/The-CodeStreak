public class main {
    public static void main (String [] args){
        ConcreateSubject subject = new ConcreateSubject();
        ConcreteObserver observer1 = new ConcreteObserver(subject);
        observer1.setObserverName("ISROISLC");
        ConcreteObserver observer2 = new ConcreteObserver(subject);
        observer2.setObserverName("Space Station");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState(10);

        subject.removeObserver(observer2);
        subject.setState(5);
    }
}
