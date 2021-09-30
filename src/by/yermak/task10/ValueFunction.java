package by.yermak.task10;

import java.util.HashMap;
import java.util.Map;

public class ValueFunction {
    public static Map<Double, Double> countValueFunction(double a, double b, double h) {
        Map<Double, Double> table = new HashMap<>();
        for (double i = a; i <= b; i += h) {
            double y = Math.tan(i);
            table.put(i, y);
        }
        return table;
    }
}
