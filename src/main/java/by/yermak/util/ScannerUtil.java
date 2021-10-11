package by.yermak.util;

import java.util.Scanner;

public final class ScannerUtil {
    public static Scanner scanner = new Scanner(System.in);

    public static int readInt(String text) {
        while (true) {
            System.out.println(text);
            String inputStr = scanner.nextLine();

            try {
                return Integer.parseInt(inputStr);
            } catch (NumberFormatException e) {
                System.out.println("Input Error! Try again!");
            }
        }
    }

    public static double readDouble(String text) {
        while (true) {
            System.out.println(text);
            String inputStr = scanner.nextLine();

            try {
                return Double.parseDouble(inputStr);
            } catch (NumberFormatException e) {
                System.out.println("Input Error! Try again!");
            }
        }
    }

    public static int readPositiveInt(String text) {
        int value = readInt(text);
        return NumberUtil.absInt(value);
    }

    public static double readPositiveDouble(String text) {
        double value = readDouble(text);
        return NumberUtil.absDouble(value);
    }

    public static int nextInt() {
        return scanner.nextInt();
    }
}
