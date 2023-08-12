public class CarMechanics {
    public CarStateHandler currentState;

    public CarMechanics (){
        currentState = new CarSwitchOnState();
    }
    public void changeState (CarStateHandler newState){
        currentState = newState;
    }
    public void displayCurrentStater(){
        currentState.displayState();
    }
}
