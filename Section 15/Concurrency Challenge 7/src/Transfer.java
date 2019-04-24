class Transfer implements Runnable {

    private BankAccount sourceAccount, destinationAccount;
    private double amount;

    Transfer(BankAccount sourceAccount, BankAccount destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    public void run() {
        while (!sourceAccount.transfer(destinationAccount, amount))
            continue;
        System.out.printf("%s completed\n", Thread.currentThread().getName());
    }
}
