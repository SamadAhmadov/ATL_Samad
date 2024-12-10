package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print first number: ");
        int a = scanner.nextInt();
        System.out.println("Print second number: ");
        int b = scanner.nextInt();

        Toplama topla = new Toplama();
        int cem = topla.Toplama(a, b);
        System.out.println("Cem: " + cem);

        Cixma cix = new Cixma();
        int ferq = cix.Cixma(a, b);
        System.out.println("Ferq: " + ferq);

        Vurma vur = new Vurma();
        int hasil = vur.Vurma(a, b);
        System.out.println("Hasil: " + hasil);

        Bolme bol = new Bolme();
        int qismet = bol.Bolme(a, b);
        System.out.println("Qismet: " + qismet);
    }
}
