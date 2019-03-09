public class SpeedConverter {
    public static double toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return kilometersPerHour / 1.609;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static void main(String[] args) {
        /*
        1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
        If the parameter kilometersPerHour is less than 0 method toMilesPerHour needs to return -1 to indicate invalid value.
        Otherwise, if it is positive, calculate the value of miles per hour and return it. For conversion check notes in the text below.

        Examples of input/output:
        * toMilesPerHour(1.5); → should return value 0.9322560596643878
        * toMilesPerHour(10.25); → should return value 6.37041640770665
        * toMilesPerHour(-5.6); → should return value -1.00000000000
        * toMilesPerHour(25.42); → should return value 15.798632691112493
        * toMilesPerHour(75.114); → should return value 46.68365444375389

        2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
        The method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
        Then it needs to print a message in the format "XX km/h = YY mi/h".
        XX represents the original value kilometersPerHour.YY represents the calculated milesPerHour from the kilometersPerHour parameter..
        If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

        Examples of input/output:
        * printConversion(1.5); → should print the following text (into the console - System.out): 1.5 km/h = 0.9322560596643878 mi/h
        * printConversion(10.25); → should print the following text (into the console - System.out): 10.25 km/h = 6.37041640770665 mi/h
        * printConversion(-5.6); → should print the following text (into the console - System.out): Invalid Value
        * printConversion(25.42); → should print the following text (into the console - System.out): 25.42 km/h = 15.798632691112493 mi/h
        * printConversion(75.114); → should print the following text (into the console - System.out): 75.114 km/h = 46.68365444375389 mi/h
        */
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}