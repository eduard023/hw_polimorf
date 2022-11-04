public class Main {
    public static void main(String[] args) {
        Bus scania = new Bus("Скания", "Авено", 3.5);
        Bus isuzu = new Bus("Исузу", "Богдан", 2.7);
        Bus ford = new Bus("Форд", "Транзит", 3.0);
        Bus hyundai = new Bus("Хондай", "Каунтри", 3.2);

        PassengerCar lada = new PassengerCar("Лада", "Гранта", 1.7);
        PassengerCar bmw = new PassengerCar("Бмв", "", 3.0);
        PassengerCar kia = new PassengerCar("Киа", "Спортэйдж", 2.4);
        PassengerCar audi = new PassengerCar("Ауди", "А8", 3.0);

        Truck kamaz = new Truck("Камаз", "6580", 12);
        Truck howo = new Truck("Хово", "HW76", 9.7);
        Truck volvo = new Truck("Вольво", "FL", 7.2);
        Truck maz = new Truck("Маз", "5550", 7.2);
        volvo.pitStop();

        DriverD ivanov = new DriverD("Иванов Алексей Владимирович", "D", 2.5, isuzu);
        DriverB petrov = new DriverB("Петров Олег Антонович", "B", 1.4, kia);
        DriverC sidorov = new DriverC("Сидоров Александр Олегович", "С", 3, maz);

        System.out.println("Водитель "+ivanov.getFullName()  +" управляет автомобилем "+ isuzu.getBrand()+ " "+isuzu.getModel() +" и будет участвовать в заезде");
        System.out.println("Водитель "+petrov.getFullName()  +" управляет автомобилем "+ kia.getBrand()+ " "+kia.getModel() +" и будет участвовать в заезде");
        System.out.println("Водитель "+sidorov.getFullName()  +" управляет автомобилем "+ maz.getBrand()+ " "+maz.getModel() +" и будет участвовать в заезде");
        sidorov.toMove(maz);

    }

}