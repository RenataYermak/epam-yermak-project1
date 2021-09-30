package by.yermak.task6;

public class TimeCount {
    public static int hourCount(int sec) {
        return sec / 3600;
    }

    public static int minCount(int sec) {
        return (sec - hourCount(sec) * 3600) / 60;
    }
}
