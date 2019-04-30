import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        /*
        Right now, the function doesn't do anything.
        Write the code that will execute the function with an argument of "1234567890"
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

        System.out.println(lambdaFunction.apply("1234567890"));
    }
}
