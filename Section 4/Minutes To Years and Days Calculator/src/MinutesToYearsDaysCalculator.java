public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600,
                 remainingMinutes = minutes % 525600,
                 days = remainingMinutes / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static void main(String[] args) {
        /*
        Write a method printYearsAndDays with parameter of type long named minutes.
        The method should not return anything (void) and it need to calculate the years and days from the minutes parameter.
        If the parameter is less than 0, print text "Invalid Value".
        Otherwise, if the parameter is valid then it need to print a message in the format "XX min = YY y and ZZ d".
        XX represents the original value minutes.
        YY represents the calculated years.
        ZZ represents the calculated days.

        Examples of input/output:
        *   printYearsAndDays(525600); -> should print "525600 min = 1 y and 0 d"
        *   printYearsAndDays(1051200); -> should print "1051200 min = 2 y and 0 d"
        *   printYearsAndDays(561600); -> should print "561600 min = 1 y and 25 d"
        */
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}