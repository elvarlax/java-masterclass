public class Main {

    public static void main(String[] args) {
        /*
        Use tryLock with a timeout value.

        Instead of using lock(), use tryLock() with a timeout value of 1 second.
        If the waiting period times out, print the message, "Could not get the lock" to the console.

        Hint: Use the form of the tryLock() method that accepts two parameters - the first parameter
        is the timeout value, and the second parameter is the time unit of the first parameter.
        Use TimeUnite.MILLISECONDS for the second parameter.
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
