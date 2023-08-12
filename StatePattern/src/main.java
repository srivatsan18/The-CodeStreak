public class main {
    public static void main(String [] args){
        CarMechanics carState = new CarMechanics();
        carState.displayCurrentStater();
        carState.changeState(new CarSwitchGears());
        carState.displayCurrentStater();
        carState.changeState(new CarSwtichOffState());
        carState.displayCurrentStater();
    }
}
