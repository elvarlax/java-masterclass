public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int x = 0; x < number; x++) {
                for (int y = 0; y < number; y++) {
                    int column = number - x;
                    if (x == 0 || x == number - 1) {
                        System.out.print("*");
                    } else if (y == 0 || y == number - 1) {
                        System.out.print("*");
                    } else if (x == y || y == column - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
    }
}
