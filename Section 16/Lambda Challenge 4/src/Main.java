import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        /*
        Instead of executing this function directly, suppose we want to pass it to a method.
        Write a method called everySecondCharacter that accepts the function as a parameter
        and executes it with the argument "1234567890".

        It should return the result of the function.
        For bonus points, don't hard-code the argument string within the method.
        */
        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        everySecondCharacter(lambdaFunction, "1234567890");
    }

    public static String everySecondCharacter(Function<String, String> function, String source) {
        return function.apply(source);
    }
}
