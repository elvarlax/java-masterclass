public class Main {

    public static void main(String[] args) {
        /*
        Update the code so that the status variable is thread safe.

        Use whatever method you like: the synchronized keyword or the lock object.
        */
        final BankAccount account = new BankAccount("12345-678", 1000.00);

        // The status variable is already thread safe because local variables are stored on the thread stack
        // so that they have their own copy of the status variable.

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
