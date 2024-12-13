package InClassTasks.NewPackage;

import java.time.LocalDate;
import java.util.Objects;

public class Human {
    private String name;
    private Integer age;
    private LocalDate birthDate;

    public Human() {
    }

    public Human(String name, Integer age, LocalDate birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(birthDate, human.birthDate) && Objects.equals(age, human.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, age);
    }
}
