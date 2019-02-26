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
        /*
        Write a method called inputThenPrintSumAndAverage that does not have any parameters.
        The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
        When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

        XX represents the sum of all entered numbers of type int.
        YY represents the calculated average of all numbers of type long.

        EXAMPLES OF INPUT/OUTPUT:

        EXAMPLE 1:

        INPUT:

        1
        2
        3
        4
        5
        a

        OUTPUT

        SUM = 15 AVG = 3


        EXAMPLE 2:

        INPUT:

        hello

        OUTPUT:

        SUM = 0 AVG = 0
        */
        inputThenPrintSumAndAverage();
    }
}