public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

    int state = 0;

    int existingState = 0;
}
