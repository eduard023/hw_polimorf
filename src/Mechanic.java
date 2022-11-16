public class Mechanic <T extends Car>{

    private final String fullName;
    private final String company;

    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public boolean passDiagnostic(T t){
        return t.passDiagnostic();
    }

    public void repair(T t){
        t.repair();

    }

    @Override
    public String toString() {
        return fullName + " из компании " + company;
    }
}
