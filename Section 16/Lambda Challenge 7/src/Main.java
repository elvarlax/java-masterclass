import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        /*
        As with Function, the Supplier won't do anything until we use it.
        Use this supplier to assign the string "I love Java!" to a variable called supplierResult.
        Then print the variable to the console.
        */
        Supplier<String> iLoveJava = () -> "I love Java!";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }
}
