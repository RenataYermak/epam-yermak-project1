package by.yermak.task4.runner;

import by.yermak.task4.service.NumberService;
import by.yermak.util.DisplayUtil;
import by.yermak.util.ScannerUtil;

/**
 * 4. Составить программу, печатающую значение true, если указанное высказывание является истинным,
 * и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 */
public class Main {
    public static void main(String[] args) {
        int count = ScannerUtil.readPositiveInt("Enter the count number");
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter the value:");
            numbers[i] = ScannerUtil.nextInt();
        }

        DisplayUtil.print(NumberService.thereAreTwoEvenNumbers(numbers));
    }
}
