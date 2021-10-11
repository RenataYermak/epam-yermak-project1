package by.yermak.util;

public final class NumberUtil {
    public static int absInt(int value) {
        return (value < 0) ? (value * -1) : value;
    }

    public static double absDouble(double value) {
        return (value < 0) ? (value * -1) : value;
    }
}
