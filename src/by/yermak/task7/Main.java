package by.yermak.task7;

import by.yermak.util.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        double x1 = ScannerUtil.readDouble("Enter x-coordinate of the first point");
        double y1 = ScannerUtil.readDouble("Enter y-coordinate of the first point");
        double x2 = ScannerUtil.readDouble("Enter x-coordinate of the second point");
        double y2 = ScannerUtil.readDouble("Enter y-coordinate of the second point");

        double length1 = Coordinate.countLengthToPoint(x1, y1);
        double length2 = Coordinate.countLengthToPoint(x2, y2);

        if (Coordinate.theFirstLengthIsCloser(length1, length2)) {
            System.out.println("The First point is closer");
        } else {
            System.out.println("The Second point is closer");
        }
    }
}
