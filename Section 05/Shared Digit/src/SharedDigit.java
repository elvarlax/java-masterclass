public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        int lx = x / 10, rx = x % 10;
        int ly = y / 10, ry = y % 10;
        if (x >= 10 && x <= 99 && y >= 10 && y <= 99) {
            return lx == ly || lx == ry || rx == ly || rx == ry;
        }
        return false;
    }

    public static void main(String[] args) {
        /*
        Write a method named hasSharedDigit with two parameters of type int.
        Each number should be within the range of 10 (inclusive) - 99 (inclusive).
        If one of the numbers is not within the range, the method should return false.
        The method should return true if there is a digit that appears in both numbers,
        such as 2 in 12 and 23; otherwise, the method should return false.

        Example input/output:
        *   hasSharedDigit(12, 23); -> should return true since the digit 2 appears in both numbers
        *   hasSharedDigit(9, 99); -> should return false since 9 is not within the range of 10-99
        *   hasSharedDigit(9, 99); -> should return true since the digit 5 appears in both numbers
        */
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}