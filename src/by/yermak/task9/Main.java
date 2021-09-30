package by.yermak.task9;

import by.yermak.util.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        double radius = ScannerUtil.readDouble("Enter the radius");
        double length = Circle.circleLength(radius);
        double area = Circle.areaCircle(radius);
        System.out.println("Circumference length " + length + ", Area circle " + area);
    }
}
