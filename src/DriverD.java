public class DriverD extends Driver<Bus>{
    public DriverD(String fullName, String driverLicense, double experience, Bus transport) {
        super(fullName, driverLicense, experience, transport);
    }

    @Override
    public void toMove(Bus transport) {
        System.out.println(getFullName()+ " на автомобиле "+ transport.getBrand() + " " + transport.getModel()+ " начал движение");
    }

    @Override
    public void stop(Bus transport) {
        System.out.println(getFullName()+ " на автомобиле "+ transport.getBrand() + " " + transport.getModel()+ " остановился");
    }

    @Override
    public void refuel(Bus transport) {
        System.out.println(getFullName()+ " на автомобиле "+ transport.getBrand() + " " + transport.getModel()+ " заправляеться");
    }
}
