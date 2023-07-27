public class Facade {
    CarController carController;
    ElectricityController electricityController;
    ParkingController parkingController;

    public Facade () {
        carController = new CarController();
        electricityController = new ElectricityController();
        parkingController = new ParkingController();
    }

    void calculateTotalEnergy(int space) {
        carController.engineSpeed();
        System.out.println(electricityController.rateCaluclator(56) + parkingController.availableSpots());
    }
}
