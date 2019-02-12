import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int counter = 0, number = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            while (scanner.hasNextInt()) {
                number += scanner.nextInt();
                counter++;
            }
            scanner.close();
            System.out.format("SUM = %d AVG = %d", number, Math.round((double) number / counter));
        } else {
            System.out.println("SUM = 0 AVG = 0");
        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}