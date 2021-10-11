package by.yermak.task8.service;

import java.util.HashMap;
import java.util.Map;

public class FunctionService {
    public static double valueOfFunction(double x) {
        if (x >= 3) {
            return Math.pow(-x, 2) + 3 * x + 9;
        } else {
            return 1 / (Math.pow(x, 3) - 6);
        }
    }
    public static Map<Double, Double> countValueFunction(double a, double b, double h) {
        Map<Double, Double> table = new HashMap<>();
        for (double i = a; i <= b; i += h) {
            double y = Math.tan(i);
            table.put(i, y);
        }
        return table;
    }
}
