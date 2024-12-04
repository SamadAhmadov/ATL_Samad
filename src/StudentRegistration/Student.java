package StudentRegistration;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String studentName;
    private LocalDate birthDate;

    public Student(String studentName, LocalDate birthDate) {
        this.studentName = studentName;
        this.birthDate = birthDate;
    }

    public String getStudentName() {
        return studentName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }

    @Override
    public String toString() {
        return "Adı: " + studentName + ", doğum tarixi: " + birthDate + ", yaşı: " + getAge();
    }
}
