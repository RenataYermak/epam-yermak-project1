package by.yermak.util;

public class NumberUtil {
    public static int absInt(int value) {
        return (value < 0) ? (value * -1) : value;
    }

    public static double absDouble(double value) {
        return (value < 0) ? (value * -1) : value;
    }
}
