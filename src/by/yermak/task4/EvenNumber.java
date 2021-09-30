package by.yermak.task4;

public class EvenNumber {
    public static boolean isEven(int[] values) {
        int sumEven = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                sumEven++;
            }
        }
        return sumEven >= 2;
    }
}
