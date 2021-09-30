package by.yermak.task6;

import by.yermak.util.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        int sec = ScannerUtil.readPositiveInt("Enter the second of the day");
        int hour = TimeCount.hourCount(sec);
        int min = TimeCount.minCount(sec);
        System.out.println(hour + " hour " + min + " minute " + sec + " second");
    }
}
