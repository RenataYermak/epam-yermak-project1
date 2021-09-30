package by.yermak.task7;

public class Coordinate {
    public static double countLengthToPoint(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public static boolean theFirstLengthIsCloser(double length1, double length2) {
        return length1 < length2;
    }
}
