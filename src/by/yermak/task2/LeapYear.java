package by.yermak.task2;

public class LeapYear {
    public static void leap(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Year " + year + " is leap");
        } else {
            System.out.println("Year " + year + " is not leap");
            System.out.println();
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
