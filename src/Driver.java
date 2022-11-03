public class Driver<T extends Car> {
    private String fullName;
    private String driverLicense;
    private double experience;

    public Driver(String fullName, String driverLicense, double experience) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
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
        if (driverLicense == null || driverLicense.isBlank() || driverLicense.isEmpty()) {
            this.fullName = "Некоректные данные";
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

    public void toMove(){

    }

    public void stop(){

    }

    public void refuel(){

    }
}
