public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public static void main(String[] args) {
        /*
        We'll say that a number is "teen" if it is in the range 13-19 (inclusive).
        Write a method named hasTeen with 3 parameters of type int.
        The method should return boolean and it need to return true
        if one of the parameters is in range 13 (inclusive) - 19.
        Otherwise return false.

        Examples of input/output:
        *   hasTeen(9, 99, 19); should return true since 19 is in range 13 - 19
        *   hasTeen(23, 15, 42); should return true since 15 is in range 13 - 19
        *   hasTeen(22, 23, 34); should return false since numbers 22, 23, 34 are not in range 13-19

        Write a method named isTeen with 1 parameter of type int.
        The method should return boolean and it need to return true
        if the parameter is in range 13 (inclusive) - 19 (inclusive).
        Otherwise return false.
        */
        System.out.println(hasTeen(9, 99, 999));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }
}
