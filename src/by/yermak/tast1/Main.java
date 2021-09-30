package by.yermak.tast1;

import by.yermak.util.ScannerUtil;
import by.yermak.util.DisplayUtil;

public class Main {
    public static void main(String[] args) {
        int value = ScannerUtil.readInt("Enter the value");
        int buffer = (int) (Math.pow((value % 10), 2) % 10);
        DisplayUtil.print(buffer);
    }
}
