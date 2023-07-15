import java.util.ArrayList;
import java.util.List;

public class ConcreateSubject implements Subject{
    private List<Observer> observers = new ArrayList<>();
    int state;

    int existingState;

    public int getState(){
        return state;
    }

    public void setState(int state){
        existingState = getState();
        this.state = state;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
