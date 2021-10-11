package by.yermak.task9.service;

public class CircleService {
    public static double areaCircle(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double circleLength(double r) {
        return 2 * Math.PI * r;
    }
}
