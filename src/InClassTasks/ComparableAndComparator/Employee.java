package InClassTasks.ComparableAndComparator;

public class Employee implements Comparable<Employee> {
    private String name;
    private Integer salary;
    private Integer age;

    public Employee(String name, Integer salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee emp1) {
//        return Integer.compare(this.age, emp1.age);
//        return emp1.getName().compareTo(this.getName());
        return this.getName().compareTo(emp1.getName());
    }
}
