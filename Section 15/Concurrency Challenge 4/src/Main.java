public class Main {

    public static void main(String[] args) {
        /*
        Use ReentrantLock.

        Instead of using the synchronized keyword, make the BankAccount class
        threadsafe using the ReentrantLock class.
        */
        final BankAccount account = new BankAccount("12345-678", 1000.00);

        // Answer: Both threads are using the same account number so it is unnecessary to use the synchronized keyword.
        // However, this question was a trick question.

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
