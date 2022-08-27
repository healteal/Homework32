public class Programmer {
    private Language language;
    private String name;
    private double salary;
    private boolean isOnline;

    public Programmer(Language language, String name, double salary, boolean isOnline) {
        this.language = language;
        this.name = name;
        this.salary = salary;
        this.isOnline = isOnline;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "language=" + language +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", isOnline=" + isOnline +
                '}';
    }
}
