package by.yermak.task7.runner;

import by.yermak.task7.entity.Point;
import by.yermak.util.DisplayUtil;
import by.yermak.util.ScannerUtil;

/**
 * 7. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
 * которая из точек находится ближе к началу координат. x y.
 */
public class Main {
    public static void main(String[] args) {
        double x1 = ScannerUtil.readDouble("Enter x-coordinate of the first point");
        double y1 = ScannerUtil.readDouble("Enter y-coordinate of the first point");
        double x2 = ScannerUtil.readDouble("Enter x-coordinate of the second point");
        double y2 = ScannerUtil.readDouble("Enter y-coordinate of the second point");

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);

        double distance1 = Point.distanceToStartCoordinate(point1);
        double distance2 = Point.distanceToStartCoordinate(point2);

        if (distance1 < distance2) {
            DisplayUtil.print(point1);
        }else if (distance1 > distance2) {
            DisplayUtil.print(point1);
            DisplayUtil.print(point2);
        } else {
            DisplayUtil.print(point2);
        }
    }
}