public class PassengerCar extends Car implements Competing{
    public PassengerCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishPacing() {

    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() +" "+ getModel() + " на пит-стопе");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга: " + getBrand() + " " + getModel());
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость: ");
    }
}
