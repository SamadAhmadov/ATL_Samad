package Academy;

public class Main {
    public static void main(String[] args) {
        Academy myAcademy = new Academy("ATL Academy", "Cəlil Məmmədquluzadə küçəsi, 102A");
        myAcademy.academyInfo();

        Teacher musviq = new Teacher("12345678", "Java BackEnd");
        musviq.teach();

        Student samad = new Student("11223344", "FrontEnd");
        samad.study();

    }
}
