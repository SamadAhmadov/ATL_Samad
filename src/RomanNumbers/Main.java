package RomanNumbers;

import java.util.Scanner;

import static RomanNumbers.RomanNumeralAddition.addRomanNumerals;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first Roman numeral: ");
        String roman1 = scanner.nextLine();

        System.out.print("Enter the second Roman numeral: ");
        String roman2 = scanner.nextLine();

        String result = addRomanNumerals(roman1, roman2);
        System.out.println("The sum of " + roman1 + " and " + roman2 + " is " + result);
    }
}
