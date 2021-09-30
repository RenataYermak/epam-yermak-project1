package by.yermak.task8;

import by.yermak.util.DisplayUtil;
import by.yermak.util.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        double x = ScannerUtil.readDouble("Enter x");
        double value = Function.valueOfFunction(x);
        DisplayUtil.print(value);
    }
}
