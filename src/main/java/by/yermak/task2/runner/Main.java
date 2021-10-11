package by.yermak.task2.runner;

import by.yermak.task2.service.YearService;
import by.yermak.util.DisplayUtil;
import by.yermak.util.ScannerUtil;

/**
 * 2.Составить программу, которая по заданным году и номеру месяца определяет количество дней
 * в этом месяце и корректно определялись все високосные года.
 */
public class Main {
    public static void main(String[] args) {
        int year = ScannerUtil.readPositiveInt("Enter  year");
        int month = ScannerUtil.readPositiveInt("Enter the number month");

        boolean leap = (YearService.isLeapYear(year));
        int daysInMonth = YearService.amountDayInMonth(year, month);
        DisplayUtil.print(leap);
        DisplayUtil.print(daysInMonth);
    }
}
