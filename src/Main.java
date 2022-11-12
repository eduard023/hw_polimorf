public class Main {
    public static void main(String[] args) {
        Bus scania = new Bus("Скания", "Авено", 3.5, Bus.Capacity.ESPECIALLY_SMALL);
        Bus isuzu = new Bus("Исузу", "Богдан", 2.7, Bus.Capacity.ESPECIALLY_BIG);
        Bus ford = new Bus("Форд", "Транзит", 3.0, Bus.Capacity.BIG);
        Bus hyundai = new Bus("Хондай", "Каунтри", 3.2, Bus.Capacity.SMALL);

        PassengerCar lada = new PassengerCar("Лада", "Гранта", 1.7, PassengerCar.TypeOfBody.SEDAN);
        PassengerCar bmw = new PassengerCar("Бмв", "3", 3.0, PassengerCar.TypeOfBody.COUPE);
        PassengerCar kia = new PassengerCar("Киа", "Спортэйдж", 2.4, PassengerCar.TypeOfBody.CROSSOVER);
        PassengerCar audi = new PassengerCar("Ауди", "А8", 3.0, PassengerCar.TypeOfBody.STATION_WAGON);

        Truck kamaz = new Truck("Камаз", "6580", 12, Truck.LoadCapacity.N2);
        Truck howo = new Truck("Хово", "HW76", 9.7, Truck.LoadCapacity.N3);
        Truck volvo = new Truck("Вольво", "FL", 7.2, Truck.LoadCapacity.N1);
        Truck maz = new Truck("Маз", "5550", 7.2, Truck.LoadCapacity.N2);

        passDiagnostic(scania, isuzu, ford,hyundai,
                lada, bmw, kia, audi,
                kamaz, howo, volvo, maz);


        DriverD ivanov = new DriverD("Иванов Алексей Владимирович", "D", 2.5, isuzu);
        DriverB petrov = new DriverB("Петров Олег Антонович", "B", 1.4, kia);
        DriverC sidorov = new DriverC("Сидоров Александр Олегович", "С", 3, maz);

        System.out.println("Водитель "+ivanov.getFullName()  +" управляет автомобилем "+ isuzu.getBrand()+ " "+isuzu.getModel() +" и будет участвовать в заезде");
        System.out.println("Водитель "+petrov.getFullName()  +" управляет автомобилем "+ kia.getBrand()+ " "+kia.getModel() +" и будет участвовать в заезде");
        System.out.println("Водитель "+sidorov.getFullName()  +" управляет автомобилем "+ maz.getBrand()+ " "+maz.getModel() +" и будет участвовать в заезде");
        printInfo(ivanov, isuzu);

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