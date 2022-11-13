public class DriverB extends Driver<PassengerCar>{

    public DriverB(String fullName, String driverLicense, double experience, PassengerCar transport) {
        super(fullName, driverLicense, experience, transport);
    }


    @Override
    public void toMove(PassengerCar transport) {
        System.out.println(getFullName()+ " на автомобиле "+ transport.getBrand() + " " + transport.getModel()+ " начал движение");
    }

    @Override
    public void stop(PassengerCar transport) {
        System.out.println(getFullName()+ " на автомобиле "+ transport.getBrand() + " " + transport.getModel()+ " остановился");
    }

    @Override
    public void refuel(PassengerCar transport) {
        System.out.println(getFullName()+ " на автомобиле "+ transport.getBrand() + " " + transport.getModel()+ " заправляеться");
    }
}
