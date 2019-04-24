public class Main {
    public static void main(String[] args) {
        /*
        Spot and fix the problem.

        Let's take a look at a similar application which also deals with Bank Accounts,
        but in this case, performs transfers from one bank account to another.

        This version of the BankAccount class has three methods: deposit(), withdraw(),
        and transfer(). The deposit() and withdraw() methods are similar to what we had before.
        The transfer() method first tries to withdraw the money from the source account.
        If it's successful, it deposits the money into the destination account and returns true.
        If it's not successful, it refunds the source account and returns false.

        In the main() method, we create two bank accounts and start two threads.
        Each thread will perform a transfer using an instance of the Transfer class.
        The Transfer class's run() method loops until a transfer is successful.

        The challenge is to spot what's wrong with this code and to fix it.

        What do we call this particular situation (deadlock, livelock, etc.)?
        This is a livelock.

        Why is it happening?
        Thread1 is trying to transfer money to Thread2, however Thread2 is busy so it refunds
        the money back and the loop continues endlessly.

        How would we fix it?
        The code did never release the lock, so I unlocked the lock after it withdraws and deposits.
        */
        BankAccount account1 = new BankAccount("12345-678", 500.00);
        BankAccount account2 = new BankAccount("98765-432", 1000.00);

        new Thread(new Transfer(account1, account2, 10.00), "Transfer1").start();
        new Thread(new Transfer(account2, account1, 55.88), "Transfer2").start();
    }
}
