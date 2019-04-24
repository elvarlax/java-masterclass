public class Main {
    public static void main(String[] args) {
        /*
        Make the BankAccount class Threadsafe using the synchronize keyword.

        I hope you can see that there's going to be thread interference when two
        threads are accessing the same BankAccount instance at the same time.
        We have to make the BankAccount class threadsafe, and that's our next challenge.
        Use the synchronized keyword to make the BankAccount class threadsafe.
        */
        final BankAccount account = new BankAccount("12345-678", 1000.00);

        Thread t1 = new Thread() {
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.00);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.00);
            }
        };

        t1.start();
        t2.start();
    }
}
