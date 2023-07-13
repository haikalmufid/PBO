import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static String getStringInput(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine();
    }

    public static int getIntInput(String message) {
        System.out.print(message + ": ");
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public static double getDoubleInput(String message) {
        System.out.print(message + ": ");
        double input = scanner.nextDouble();
        scanner.nextLine();
        return input;
    }
}