import java.util.Scanner;

public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private double price;

    public Hamburger(String name, String breadRoll, String meat) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = 10;
    }

    public String getName() {
        return name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void addAddition() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false, cheese = false, bacon = false, onion = false, tomato = false;
        while (!exit) {
            System.out.println("You can pick up to 4 additions on the Hamburger");
            System.out.println("Type numbers between 1-5");
            System.out.println("Additions: ");
            System.out.println("1) Cheese");
            System.out.println("2) Bacon");
            System.out.println("3) Onion");
            System.out.println("4) Tomato");
            System.out.println("5) Exit");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    if (!cheese) {
                        price += 5;
                        cheese = true;
                        System.out.println("Cheese was added to the burger!");
                    } else System.out.println("Cheese has already been added!");
                    break;
                case 2:
                    if (!bacon) {
                        price += 5;
                        bacon = true;
                        System.out.println("Bacon was added to the burger!");
                    } else System.out.println("Bacon has already been added!");
                    break;
                case 3:
                    if (!onion) {
                        price += 5;
                        onion = true;
                        System.out.println("Onion was added to the burger!");
                    } else System.out.println("Onion has already been added!");
                    break;
                case 4:
                    if (!tomato) {
                        price += 5;
                        tomato = true;
                        System.out.println("Tomato was added to the burger!");
                    } else System.out.println("Tomato has already been added!");
                    break;
                case 5:
                    exit = true;
            }
        }
    }
}
