public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }
        return false;
    }

    public static void main(String[] args) {
        /*
        Write a method isLeapYear with a parameter of type int named year.
        The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
        If the parameter is not in that range return false.
        Otherwise, if it is in the valid range, calculate if the year is leap year and return true if it is a leap year,
        otherwise return false.

        To determine whether a year is a leap year, follow these steps:
        1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
        2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
        3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
        4. The year is a leap year (it has 366 days). The method isLeapYear need to return true.
        5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

        The following years are not leap years:
        1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
        This is because they are evenly divisible by 100 but not 400.

        The following years are leap years:
        1600, 2000, 2400
        This is because they are evenly divisible by both 100 and 400.

        Examples of input/output:
        *   isLeapYear(-1600); -> should return false since the parameter is not in range (1-9999)
        *   isLeapYear(1600); -> should return true since 1600 is a leap year
        *   isLeapYear(2017); -> should return false since 2017 is not a leap year
        *   isLeapYear(2000); -> should return true because 2000 is a leap year
        */
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
}