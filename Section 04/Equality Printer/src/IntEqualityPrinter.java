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
        /*
        Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
        If one of the parameters is less then 0, print text "Invalid Value".
        If all numbers are equal print text "All numbers are equal".
        If all numbers are different print text "All numbers are different".
        Otherwise, print "Neither all are equal or different".

        Examples of input/output:
        *   printEqual(1, 1, 1); should print text All numbers are equal
        *   printEqual(1, 1, 2); should print text Neither all are equal or different
        *   printEqual(-1, -1, -1); should print text Invalid Value
        *   printEqual(1, 2, 3); should print text All numbers are different
        */
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }
}