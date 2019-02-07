public class LastDigitChecker {
    public static boolean isValid(int n) {
        return n >= 10 && n <= 1000;
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (isValid(n1) && isValid(n2) && isValid(n3)) {
            return n1 % 10 == n2 % 10 || n3 % 10 == n1 % 10 || n2 % 10 == n3 % 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 99));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }
}