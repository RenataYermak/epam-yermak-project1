package by.yermak.task3.service;

public final class SquareService {
    public static double innerSquareArea(double radius) {
        return 2 * radius * radius;
    }

    public static double sideOfSquare(double area) {
        return Math.sqrt(area);
    }

    public static double differenceArea(double innerArea, double outerArea) {
        return outerArea / innerArea;
    }
}
