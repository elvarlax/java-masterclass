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
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}