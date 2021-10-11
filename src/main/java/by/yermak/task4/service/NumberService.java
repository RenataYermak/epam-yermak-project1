package by.yermak.task4.service;

public final class NumberService {
    public static boolean thereAreTwoEvenNumbers(int[] values) {
        int sumEven = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                sumEven++;
            }
        }

        return sumEven >= 2;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
