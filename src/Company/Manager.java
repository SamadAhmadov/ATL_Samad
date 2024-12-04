package Company;

public class Manager extends Employee {
    public String departmentManaged;
    public static final int MANAGEMENT_PAYMENT = 1000;

    public Manager(int number, String name, int year, String department, String departmentManaged) {
        super(number, name, year, department);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public int calculateSalary() {
        int yearsWorked = 2024 - year;
        int employeeSalary = super.calculateSalary();
        return yearsWorked * MANAGEMENT_PAYMENT + employeeSalary;
    }

    public void manage() {
        System.out.println(name + " is managing the " + departmentManaged + " department.");
    }

    @Override
    public void work() {
        System.out.println(name + " is working " + "in the " + department + " department.");
    }

    @Override
    public void printInfo() {
        System.out.println("Manager " + name + " works in the " + department + " department" + ", manages " + departmentManaged +
                " department and earns " + calculateSalary() + " AZN.");
    }
}