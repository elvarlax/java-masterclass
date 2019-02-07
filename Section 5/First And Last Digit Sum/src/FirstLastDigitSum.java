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
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
}