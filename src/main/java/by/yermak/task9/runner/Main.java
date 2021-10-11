package by.yermak.task9.runner;

import by.yermak.task9.service.CircleService;
import by.yermak.util.DisplayUtil;
import by.yermak.util.ScannerUtil;

/**
 * 9. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */
public class Main {
    public static void main(String[] args) {
        double radius = ScannerUtil.readDouble("Enter the radius");
        double length = CircleService.circleLength(radius);
        double area = CircleService.areaCircle(radius);
        DisplayUtil.print("Circumference length " + length + ", Area circle " + area);
    }
}
