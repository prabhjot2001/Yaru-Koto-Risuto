package utils;

import java.util.Scanner;

public class InputUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static int readInt(String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static double readDouble(String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static boolean readBoolean(String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                String input = scanner.nextLine();
                if (input.equals("yes") || input.equals("1") || input.equals("true")) {
                    return true;
                } else if (input.equals("no") || input.equals("0") || input.equals("false")) {
                    return false;
                } else {
                    System.out.println("please enter yes or no");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}