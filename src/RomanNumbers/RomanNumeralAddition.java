package RomanNumbers;

import java.util.HashMap;

public class RomanNumeralAddition {

    private static final HashMap<Character, Integer> romanToIntegerMap = new HashMap<>();

    static {
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);
    }

    public static int romanToInt(String roman) {
        int sum = 0;
        for (int i = 0; i < roman.length(); i++) {
            int currentVal = romanToIntegerMap.get(roman.charAt(i));
            if (i < roman.length() - 1 && currentVal < romanToIntegerMap.get(roman.charAt(i + 1))) {
                sum -= currentVal; // Subtraction case
            } else {
                sum += currentVal;
            }
        }
        return sum;
    }

    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(symbols[i]);
            }
        }

        return result.toString();
    }

    public static String addRomanNumerals(String roman1, String roman2) {
        int value1 = romanToInt(roman1);
        int value2 = romanToInt(roman2);
        int sum = value1 + value2;
        return intToRoman(sum);
    }
}
