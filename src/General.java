import java.util.ArrayList;

public class General {
    public static void main(String[] args) {
        ArrayList<Programmer> programmers = new ArrayList<>();
        programmers.add(new Programmer(Language.JAVA, "SKG", 44000, false));
        programmers.add(new Programmer(Language.JS, "GFD", 60000, true));
        programmers.add(new Programmer(Language.PYTHON, "ASD", 10000, false));
        programmers.add(new Programmer(Language.JS, "GFY", 50000, true));
        programmers.add(new Programmer(Language.PYTHON,"DSA", 100000, true));
        System.out.println("Максимальная з/п по всем = " + maxSalary(programmers));
        System.out.println("Минимальная з/п по всем = " + minSalary(programmers));
        System.out.println("Средняя з/п по всем = " + avgSalary(programmers));
        System.out.println("Количество программистов = " + countProgrammers(programmers));
        System.out.println("Программисты работающие онлайн:");
        workingOnline(programmers);
        System.out.println("Java программистов = " + countJavaProgrammers(programmers));
        System.out.println("Python программисты работающие онлайн:");
        workingOnlinePython(programmers);
        System.out.println("Самая большая зарплата программиста JS = " + maxSalaryJSProgrammers(programmers));
    }

    static double maxSalary (ArrayList<Programmer> programmers) {
        return programmers.stream().mapToDouble(Programmer::getSalary).max().getAsDouble();
    }

    static double minSalary (ArrayList<Programmer> programmers) {
        return programmers.stream().mapToDouble(Programmer::getSalary).min().getAsDouble();
    }

    static double avgSalary (ArrayList<Programmer> programmers) {
        return programmers.stream().mapToDouble(Programmer::getSalary).average().getAsDouble();
    }

    static int countProgrammers (ArrayList<Programmer> programmers) {
        return (int) programmers.stream().count();
    }

    static void workingOnline (ArrayList<Programmer> programmers) {
         programmers.stream().filter(Programmer::isOnline).map(Programmer::getName).forEach(System.out::println);
    }

    static int countJavaProgrammers (ArrayList<Programmer> programmers) {
        return (int) programmers.stream().filter(x -> x.getLanguage() == Language.JAVA).count();
    }

    static void workingOnlinePython (ArrayList<Programmer> programmers) {
        programmers.stream().filter(Programmer::isOnline).filter(x -> x.getLanguage() == Language.PYTHON).map(Programmer::getName).forEach(System.out::println);
    }

    static double maxSalaryJSProgrammers (ArrayList<Programmer> programmers) {
        return programmers.stream().filter(x -> x.getLanguage() == Language.JS).mapToDouble(Programmer::getSalary).max().getAsDouble();
    }
}
