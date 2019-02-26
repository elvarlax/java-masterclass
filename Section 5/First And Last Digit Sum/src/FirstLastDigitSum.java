public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int result = -1;
        if (number >= 0) {
            int temp = number;
            while (temp > 9) {
                temp = temp / 10;
            }
            result = temp + number % 10;
        }
        return result;
    }

    public static void main(String[] args) {
        /*
        Write a method named sumFirstAndLastDigit with one parameter of type int called number.
        The method need to find the first and the last digit of the parameter number passed to the method,
        using a loop and return the sum of the first and the last digit of that number.
        If the number is negative then the method needs to return -1 to indicate an invalid value.

        Example input/output:
        *   sumFirstAndLastDigit(252); -> should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
        *   sumFirstAndLastDigit(257); -> should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
        *   sumFirstAndLastDigit(0); -> should return 0, the first digit and the last is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
        *   sumFirstAndLastDigit(5); -> should return 10, the first digit and the last is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
        */
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
    }
}