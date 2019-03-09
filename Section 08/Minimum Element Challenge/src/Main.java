import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Write a method called readIntegers() with a parameter called count that represents
        how many integers the user need to enter.

        The method need to read from the console until all the numbers are entered, and
        then return an array containing the numbers entered.

        Write a method findMin() with the array as a parameter. The method need to return
        the minimum value in the array.

        In the main() method read the count from the console and call the method readIntegers()
        with the count parameter.

        Then call the findMin() method passing the array returned from the call to the
        readIntegers() method.
        */
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:\r");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
