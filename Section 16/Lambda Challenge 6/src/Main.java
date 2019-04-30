import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        /*
        Now write a lambda expression that maps to the java.util.Supplier interface.
        This lambda should return the string "I love Java!" Assign it to a variable called iLoveJava.
        */
        Supplier<String> iLoveJava = () -> "I love Java!";
    }
}
