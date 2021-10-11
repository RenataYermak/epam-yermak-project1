package by.yermak.task1.runner;

import by.yermak.util.ScannerUtil;
import by.yermak.util.DisplayUtil;

/**
 * 1. Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.
 */
public class Main {
    public static void main(String[] args) {
        int value = ScannerUtil.readInt("Enter the value");
        int result = (int) (Math.pow((value % 10), 2) % 10);
        DisplayUtil.print(result);
    }
}
