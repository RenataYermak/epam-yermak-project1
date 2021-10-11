package by.yermak.task6.runner;

import by.yermak.task6.service.TimeCountService;
import by.yermak.util.DisplayUtil;
import by.yermak.util.ScannerUtil;

/**
 * 6. Идет n-я секунда суток, определить, сколько полных часов,полных минут и секунд прошло к этому моменту.
 */
public class Main {
    public static void main(String[] args) {
        int sec = ScannerUtil.readPositiveInt("Enter the second of the day");
        int hour = TimeCountService.hourCount(sec);
        int min = TimeCountService.minCount(sec);
        DisplayUtil.print(hour + " hour " + min + " minute " + sec + " second");
    }
}
