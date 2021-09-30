package by.yermak.task4;

import by.yermak.util.DisplayUtil;
import by.yermak.util.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        int count = ScannerUtil.readPositiveInt("Enter the count number");
        int[] allNumber = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter the value:");
            allNumber[i] = ScannerUtil.nextInt();
        }

        DisplayUtil.printBoolean(EvenNumber.isEven(allNumber));
    }
}
