package by.yermak.task5.runner;

import by.yermak.task4.service.NumberService;
import by.yermak.util.DisplayUtil;
import by.yermak.util.ScannerUtil;

/**
 * 5. Составить программу, печатающую значение true, если указанное высказывание является истинным,
 * и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
 */
public class Main {
    public static void main(String[] args) {
        int number = ScannerUtil.readInt("Enter number");
        boolean buffer = NumberService.isPerfectNumber(number);
        DisplayUtil.print(buffer);
    }
}
