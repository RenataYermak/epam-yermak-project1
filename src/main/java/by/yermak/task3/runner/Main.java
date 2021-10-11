package by.yermak.task3.runner;

import by.yermak.task3.service.SquareService;
import by.yermak.util.DisplayUtil;
import by.yermak.util.ScannerUtil;

/**
 * 3.Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность.
 * Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */
public class Main {
    public static void main(String[] args) {
        double outerAreaSquare = ScannerUtil.readPositiveDouble("Enter the area of a square ");
        double innerAreaSquare = SquareService.innerSquareArea(SquareService.sideOfSquare(outerAreaSquare) / 2);
        DisplayUtil.print(innerAreaSquare);
        DisplayUtil.print(SquareService.differenceArea(innerAreaSquare, outerAreaSquare));
    }
}
