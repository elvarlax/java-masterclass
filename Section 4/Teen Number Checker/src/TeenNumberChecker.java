public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 999));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }
}
