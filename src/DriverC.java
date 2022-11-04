public class DriverC extends Driver<Truck>{

    public DriverC(String fullName, String driverLicense, double experience, Truck transport) {
        super(fullName, driverLicense, experience, transport);
    }

    @Override
    public void toMove(Truck transport) {
        System.out.println(getFullName()+ " на автомобиле "+ transport.getBrand() + " " + transport.getModel()+ " начал движение");
    }

    @Override
    public void stop(Truck transport) {
        System.out.println(getFullName()+ " на автомобиле "+ transport.getBrand() + " " + transport.getModel()+ " остановился");
    }

    @Override
    public void refuel(Truck transport) {
        System.out.println(getFullName()+ " на автомобиле "+ transport.getBrand() + " " + transport.getModel()+ " заправляеться");
    }
}
