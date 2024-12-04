package Company;

public class Employee {
    public int number;
    public String name;
    public int year;
    public String department;
    public static final int BASE_SALARY = 500;

    public Employee(int number, String name, int year, String department) {
        this.number = number;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public int calculateSalary() {
        int yearsWorked = 2024 - year;
        return yearsWorked * BASE_SALARY;
    }

    public void work() {
        System.out.println(name + " is working " + "in the " + department + " department.");
    }

    public void printInfo() {
        System.out.println("Employee " + name + " works in the " + department + " department" + ", earns " + calculateSalary() + " AZN.");
    }
}
