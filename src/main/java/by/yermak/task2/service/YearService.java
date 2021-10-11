package by.yermak.task2.service;

public final class YearService {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int amountDayInMonth(int year, int monthNumber) {
        int days;
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = YearService.isLeapYear(year) ? 29 : 28;
                break;
            default:
                throw new NumberFormatException("No month with this number");
        }
        return days;
    }
}