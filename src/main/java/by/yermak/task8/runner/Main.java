package by.yermak.task8.runner;

import by.yermak.task8.service.FunctionService;
import by.yermak.util.DisplayUtil;
import by.yermak.util.ScannerUtil;

/**
 * 8. Вычислить значение функции.
 */
public class Main {
    public static void main(String[] args) {
        double x = ScannerUtil.readDouble("Enter x");
        double value = FunctionService.valueOfFunction(x);
        DisplayUtil.print(value);
    }
}
