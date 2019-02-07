public class IntEqualityPrinter {
    public static void printEqual(int n1, int n2, int n3) {
        if (n1 >= 0 && n2 >= 0 && n3 >= 0) {
            if (n1 == n2 && n1 == n3) {
                System.out.println("All numbers are equal");
            } else if (n1 != n2 && n1 != n3 && n2 != n3) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }
}