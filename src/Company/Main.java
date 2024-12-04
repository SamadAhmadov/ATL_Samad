package Company;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Ali", 2015, "Sales");
        employee1.work();
        employee1.printInfo();
        System.out.println();

        Manager manager1 = new Manager(2, "Faiq", 2012, "Marketing", "Sales");
        manager1.work();
        manager1.manage();
        manager1.printInfo();
        System.out.println();

        Director director1 = new Director(3, "Mikayil", 2005, "Management", "Sales", 5000.00);
        director1.work();
        director1.planStrategy();
        director1.specialMethod();
        director1.printInfo();
    }
}
