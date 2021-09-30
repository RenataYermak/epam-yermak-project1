package by.yermak.task5;

public class PerfectNumber {
    public static boolean isPerfectNumber(int value) {
        int sum = 0;
        for (int i = 1; i <= value / 2; i++) {
            if (value % i == 0) {
                sum += i;
            }
        }
        return sum == value;
    }
}
