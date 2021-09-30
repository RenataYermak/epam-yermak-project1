package by.yermak.task2;

import by.yermak.util.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        int year = ScannerUtil.readPositiveInt("Enter  year");
        int month = ScannerUtil.readPositiveInt("Enter the number month");
        LeapYear.leap(year);
        AmountDay.amountDayInMonth(year, month);
    }
}
