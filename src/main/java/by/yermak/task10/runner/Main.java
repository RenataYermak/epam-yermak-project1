package by.yermak.task10.runner;

import by.yermak.task8.service.FunctionService;
import by.yermak.util.ScannerUtil;

import java.util.Map;

/**
 * 10. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
 * Результат представить в виде таблицы, первый столбец которой – значения аргумента,
 * второй - соответствующие значения функции
 */
public class Main {
    public static void main(String[] args) {
        double a = ScannerUtil.readDouble("Enter start segment");
        double b = ScannerUtil.readDouble("Enter finish segment");
        double h = ScannerUtil.readDouble("Enter step ");
        Map<Double, Double> table = FunctionService.countValueFunction(a, b, h);

        for (Map.Entry<Double, Double> element : table.entrySet()) {
            System.out.println(element.getKey() + ", " + element.getValue());
        }
    }
}
