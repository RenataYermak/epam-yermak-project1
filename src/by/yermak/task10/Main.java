package by.yermak.task10;

import by.yermak.util.ScannerUtil;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        double a = ScannerUtil.readDouble("Enter start segment");
        double b = ScannerUtil.readDouble("Enter finish segment");
        double h = ScannerUtil.readDouble("Enter step ");
        Map<Double, Double> table = ValueFunction.countValueFunction(a, b, h);

        for (Map.Entry<Double, Double> element : table.entrySet()) {
            System.out.println(element.getKey() + ", " + element.getValue());
        }
    }
}
