package by.yermak.task3;

import by.yermak.util.DisplayUtil;
import by.yermak.util.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        double innerAreaSquare = ScannerUtil.readPositiveDouble("Enter the area of a square ");
        double outerAreaSquare = Square.areaSquare(Square.sideOuterSquare(innerAreaSquare));
        DisplayUtil.print(outerAreaSquare);
        DisplayUtil.print(Square.differenceArea(innerAreaSquare, outerAreaSquare));
    }
}
