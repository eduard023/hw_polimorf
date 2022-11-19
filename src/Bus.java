public class Bus extends Car implements Competing{

    private Capacity capacity;


    public enum Capacity{
        ESPECIALLY_SMALL(1, 10),
        SMALL(10, 25),
        AVERAGE(40, 50),
        BIG(60, 80),
        ESPECIALLY_BIG(100, 120);

        private final int from;
        private final int to;

        public int getFrom() {
            return from;
        }
        public int getTo() {
            return to;
        }


        Capacity(int from, int to) {
            this.from = from;
            this.to = to;


        }
    }
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
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
        if(capacity == null){
            System.out.println("Данных по авто не достаточно");
        }else {
            System.out.println("Вместимость автобуса: от чел. " + capacity.getFrom() + " до чел. " + capacity.getTo());
        }
    }

    @Override
    public boolean passDiagnostic() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждаеться.");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починена!");
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
