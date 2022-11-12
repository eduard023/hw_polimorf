public class PassengerCar extends Car implements Competing{

    private TypeOfBody typeOfBody;

    public enum TypeOfBody{SEDAN, HATCHBACK, COUPE, STATION_WAGON, OFFROADER, CROSSOVER, PICKUP_TRUCK, VAN, MINIVAN}
    public PassengerCar(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public void startMoving() {
        System.out.println(getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void finishPacing() {
        System.out.println(getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void printType() {
        if(typeOfBody == null){
            System.out.println("Данных по авто не достаточно");
        }else {
            System.out.println("Тип кузова авто: " + typeOfBody);
        }
    }

    @Override
    public boolean passDiagnostic() {
        return Math.random() > 0.6;
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
        System.out.println("Максимальная скорость: " + getBrand() + " " + getModel());
    }
}
