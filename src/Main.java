import java.util.List;

public class Main {
    public static void main(String[] args) {

        Mechanic<PassengerCar> ivan = new Mechanic("Иван Иванов", "Пирелли");
        Mechanic<Truck> petr = new Mechanic("Петр Петров", "Лукойл");
        Mechanic<Bus> oleg = new Mechanic("Олге Соколов", "Нокиан");
        Mechanic<Car> aleks = new Mechanic("Александр Александров", "Нео");

        Sponsor rosneft = new Sponsor("Rosneft", 1_000_000);
        Sponsor lukoil = new Sponsor("Lukoil", 3_000_000);
        Sponsor pirelli = new Sponsor("Pirelli", 5_000_000);
        Sponsor motul = new Sponsor("Motul", 2_500_500);


        Bus scania = new Bus("Скания", "Авено", 3.5, Bus.Capacity.ESPECIALLY_SMALL);
        Bus isuzu = new Bus("Исузу", "Богдан", 2.7, Bus.Capacity.ESPECIALLY_BIG);
        isuzu.addDriver( new DriverD("Иванов Алексей Владимирович", "D", 2.5, isuzu));
        isuzu.addMechanic(oleg);
        isuzu.addSponsor(motul);
        Bus ford = new Bus("Форд", "Транзит", 3.0, Bus.Capacity.BIG);
        Bus hyundai = new Bus("Хондай", "Каунтри", 3.2, Bus.Capacity.SMALL);

        PassengerCar lada = new PassengerCar("Лада", "Гранта", 1.7, PassengerCar.TypeOfBody.SEDAN);
        PassengerCar bmw = new PassengerCar("Бмв", "3", 3.0, PassengerCar.TypeOfBody.COUPE);

        PassengerCar kia = new PassengerCar("Киа", "Спортэйдж", 2.4, PassengerCar.TypeOfBody.CROSSOVER);
        kia.addDriver(new DriverB("Петров Олег Антонович", "B", 1.4, kia));
        kia.addMechanic(ivan);
        kia.addSponsor(rosneft, motul);

        PassengerCar audi = new PassengerCar("Ауди", "А8", 3.0, PassengerCar.TypeOfBody.STATION_WAGON);
        audi.addDriver(new DriverB("Олегов Антон Иванович", "В", 2, audi));
        audi.addMechanic(aleks);
        audi.addSponsor(lukoil, rosneft);

        Truck kamaz = new Truck("Камаз", "6580", 12, Truck.LoadCapacity.N2);
        Truck howo = new Truck("Хово", "HW76", 9.7, Truck.LoadCapacity.N3);
        Truck volvo = new Truck("Вольво", "FL", 7.2, Truck.LoadCapacity.N1);
        Truck maz = new Truck("Маз", "5550", 7.2, Truck.LoadCapacity.N2);
        maz.addDriver(new DriverC("Сидоров Александр Олегович", "С", 3, maz));
        maz.addMechanic(petr);
        maz.addSponsor(lukoil, pirelli);

        List<Car> cars = List.of(isuzu, kia, audi, maz);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addPassengerCar(kia);
        serviceStation.addTruck(maz);
        serviceStation.service();
        serviceStation.service();
        for (Car car : cars){
            printInfo2(car);
        }

    }

    private static void printInfo2(Car car){
        System.out.println("Информация по авто " + car.getBrand()+ " " + car.getModel());
        System.out.println("Водители: " + car.getDrivers());
        System.out.println("Спонсоры: " + car.getSponsors());
        System.out.println("Механики: " + car.getMechanics());
    }

    private static void passDiagnostic(Car... cars){
        for (Car car : cars) {
            service(car);
        }
    }

    private static void service(Car car) {
        try {
            if (!car.passDiagnostic()) {
                throw new RuntimeException("Автомобиль " + car.getBrand() + " " + car.getModel() + " не прошел диагностику.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

        private static void printInfo (Driver < ? > driver, Car car){
            System.out.println("Водитель " + driver.getFullName() +
                    " управляет автомобилем " + car.getBrand() + " " + car.getModel() +
                    "и будет участвовать в заезде.");
            car.printType();
        }


}