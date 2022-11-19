import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Car> cars = new ArrayDeque<>();

    private void add(Car car){
        cars.offer(car);
    }
    public void addPassengerCar(PassengerCar passengerCar){
        add(passengerCar);
    }
    public void addTruck(Truck truck){
        cars.offer(truck);
    }

    public void service(){
        if (!cars.isEmpty()){
            Car car = cars.poll();
            boolean result = car.passDiagnostic();
            if (!result){
                car.repair();
            }
        }

    }
}
