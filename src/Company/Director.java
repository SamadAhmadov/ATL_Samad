package Company;

public class Director extends Manager {
    public double bonus;
    public static final int DIRECTOR_PAYMENT = 2000;

    public Director(int number, String name, int year, String department, String departmentManaged, double bonus) {
        super(number, name, year, department, departmentManaged);
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary() {
        int yearsWorked = 2024 - year;
        int managerSalary = super.calculateSalary();
        return yearsWorked * DIRECTOR_PAYMENT + managerSalary + (int) bonus;
    }

    public void planStrategy() {
        System.out.println(name + " is planning the strategy for the company.");
    }

    public void specialMethod() {
        System.out.println(name + " is overseeing all operations and planning the company's strategy.");
    }

    @Override
    public void work() {
        System.out.println(name + " is working " + "in the " + department + " department.");
    }

    @Override
    public void printInfo() {
        System.out.println("Director " + name + " works in the " + department + " department" + ", manages " + departmentManaged +
                " department and earns " + calculateSalary() + " AZN with a bonus of " + bonus + ".");
    }
}