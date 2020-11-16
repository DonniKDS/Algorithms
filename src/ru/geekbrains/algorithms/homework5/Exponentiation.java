package ru.geekbrains.algorithms.homework5;

public class Exponentiation {

    public static void main(String[] args) {
        System.out.println(6*6*6*6*6*6*6*6);
        System.out.println(exponentiation(6, 8));
        System.out.println((double)1/(6*6*6*6*6*6*6*6));
        System.out.println(exponentiation(6, -8));
    }

    public static double exponentiation(long number, int exponent) {
        return сalculation(number, exponent, number);
    }

    public static double сalculation(long number, int exponent, double result) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return result;
        }
        if (exponent == -1) {
            return 1/result;
        }
        if (exponent > 1) {
            return сalculation(number, --exponent, result * number);
        }
        if (exponent < -1) {
            return сalculation(number, ++exponent, result * number);
        }
        return result;
    }
}
