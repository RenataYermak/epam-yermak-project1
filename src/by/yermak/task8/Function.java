package by.yermak.task8;

public class Function {
    public static double valueOfFunction(double x) {
        if (x >= 3) {
            return Math.pow(-x, 2) + 3 * x + 9;
        } else {
            return 1 / (Math.pow(x, 3) - 6);
        }
    }
}
