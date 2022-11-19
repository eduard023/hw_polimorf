public class Truck extends Car implements Competing{

    private LoadCapacity loadCapacity;

    public enum LoadCapacity{
        N1(0D, 3.5),
        N2(3.5, 12D),
        N3(12D, null);

        LoadCapacity(Double from, Double to) {
            this.from = from;
            this.to = to;
        }

        private final Double from;
       private final Double to;

        public Double getFrom() {
            return from;
        }

        public Double getTo() {
            return to;
        }
    }
    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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
        if(loadCapacity == null){
            System.out.println("Данных по авто не достаточно");
        }else {
            String from = loadCapacity.getFrom() == null ? "" : "от " + loadCapacity.getFrom() + " ";
            String to = loadCapacity.getTo() == null ? "" : "до " + loadCapacity.getTo();
            System.out.println("Грузоподъемность авто: " + from + to);
        }
    }

    @Override
    public boolean passDiagnostic() {
        return Math.random() > 0.75;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починена!");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " на пит-стопе");
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
