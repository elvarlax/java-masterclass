public class Main {
    public static void main(String[] args) {
        /*
        You job is to create a simple banking application.
        There should be a Bank class
        It should have an ArrayList of Branches
        Each Branch should have an ArrayList of Customers
        The Customer class should have an ArrayList of Doubles (transactions)
        Customer:
        Name, and the ArrayList of doubles.
        Branch:
        Need to be able to add a new customer and initial transaction amount.
        Also needs to add additional transactions for that customer/branch
        Bank:
        Add a new branch
        Add a customer to that branch with initial transaction
        Add a transaction for an existing customer for that branch
        Show a list of customers for a particular branch and optionally a list
        of their transactions
        Demonstration autoboxing and unboxing in your code
        Hint: Transactions
        Add data validation.
        e.g. check if exists, or does not exist, etc.
        Think about where you are adding the code to perform certain actions
        */
        Bank bank = new Bank("Bank of America");

        if (bank.addBranch("New York")) {
            System.out.println("New York branch created");
        }

        bank.addCustomer("New York", "Tim", 259.45);
        bank.addCustomer("New York", "Kevin", 185.31);
        bank.addCustomer("New York", "Robert", 225.62);

        bank.addBranch("California");
        bank.addCustomer("California", "Bob", 190.59);

        bank.addCustomerTransaction("California", "Bob", 79.26);
        bank.addCustomerTransaction("California", "Bob", 66.48);
        bank.addCustomerTransaction("California", "John", 15.65);

        bank.listCustomers("New York", true);
        bank.listCustomers("California", true);

        bank.addBranch("Texas");

        if (!bank.addCustomer("Texas", "Donald", 5.53)) {
            System.out.println("Error Texas branch does not exist");
        }

        if (!bank.addBranch("New York")) {
            System.out.println("New York branch already exists");
        }

        if (!bank.addCustomerTransaction("New York", "Smith", 89.37)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("New York", "John", 36.24)) {
            System.out.println("Customer Tim already exists");
        }
    }
}
