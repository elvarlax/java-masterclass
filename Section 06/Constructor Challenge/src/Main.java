public class Main {
    public static void main(String[] args) {
        /*
        Create a new class for bank account
        Create field for the account number, balance, customer name, email and phone number.
        Create getters and setters for each field

        Create to additional methods
        1. To allow the customer to deposit funds (this should increment the balance field).
        2. To allow the customer to withdraw funds.

        This should deduct from the balance field, but not allow the withdrawal
        to complete if their are insufficient funds.

        You will want to create various code in the Main class (the one create by IntelliJ)
        to confirm your code is working.
        Add some System.out.println's in the two methods above as well.
        */
        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
        System.out.println();

        /*
        Create a new class VipCustomer
        It should have 3 fields name, credit limit, and email address.
        create 3 constructors
        1st constructor empty should call the constructor with 3 parameters with default values
        2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        3rd constructor should save all fields.
        create getters only for this using code generation of IntelliJ as setters wont be needed
        test and confirm it works.
        */
        VipCustomer vipCustomer1 = new VipCustomer();
        VipCustomer vipCustomer2 = new VipCustomer("Bob", 100.0);
        VipCustomer vipCustomer3 = new VipCustomer("Bob", 100.0, "myemail@bob.com");
        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getCreditLimit());
        System.out.println(vipCustomer1.getEmailAddress());
        System.out.println();
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getCreditLimit());
        System.out.println(vipCustomer2.getEmailAddress());
        System.out.println();
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getCreditLimit());
        System.out.println(vipCustomer3.getEmailAddress());
    }
}
