package by.yermak.task2;

public class AmountDay {
    public static void amountDayInMonth(int year, int monthNumber) {
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
                System.out.println("There are " + days + " days in a month");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                System.out.println("There are " + days + " days in a month");
                break;
            case 2:
                if (LeapYear.isLeapYear(year) == true) {
                    days = 29;
                } else days = 28;
                System.out.println("There are " + days + " days in a month");
                break;
            default:
                System.out.println("No month with this number");
        }
    }
}

