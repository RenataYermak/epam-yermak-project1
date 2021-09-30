package by.yermak.task5;

import by.yermak.util.DisplayUtil;
import by.yermak.util.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        int value = ScannerUtil.readInt("Enter value");
        boolean buffer = PerfectNumber.isPerfectNumber(value);
        DisplayUtil.printBoolean(buffer);
    }
}
