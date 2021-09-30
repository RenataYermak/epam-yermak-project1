package by.yermak.task3;

public class Square {
    public static double areaSquare(double side) {
        return 2 * Math.pow((side / 2), 2);
    }

    public static double sideOuterSquare(double area) {
        return Math.sqrt(area);
    }

    public static double differenceArea(double innerArea, double outerArea) {
        return innerArea / outerArea;
    }
}
