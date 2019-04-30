import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        /*
        Using the bonus version, call the method with the lambdaFunction we created
        earlier and the string "1234567890". Print the result returned from the method.
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

        System.out.println(everySecondCharacter(lambdaFunction, "1234567890"));
    }

    public static String everySecondCharacter(Function<String, String> function, String source) {
        return function.apply(source);
    }
}
