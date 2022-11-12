public class Driver<T extends Car & Competing> {
    private String fullName;
    private String driverLicense;
    private double experience;

    private T transport;
    public Driver(String fullName, String driverLicense, double experience, T transport) {
        this.fullName = fullName;
        this.experience = experience;
        this.transport = transport;
        setDriverLicense(driverLicense);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isBlank() || fullName.isEmpty()) {
            this.fullName = "Имя неизвестно";
        } else {
            this.fullName = fullName;
        }
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        } else {
            this.fullName = fullName;
        }
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        if (experience == 0) {
            this.experience = 0.6;
        } else {
            this.experience = experience;
        }
    }

    public void toMove(T transport){
        System.out.println(fullName + "начал движение");
    }

    public void stop(T transport){

    }

    public void refuel(T transport){

    }
}
