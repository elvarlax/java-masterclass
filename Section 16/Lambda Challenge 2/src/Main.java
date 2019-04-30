import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        /*
        Write the following method as a lambda expression:
        public static String everySecondChar(String source) {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        }
        */
        Function<String, String> lambda = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
    }
}
