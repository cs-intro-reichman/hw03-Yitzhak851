/**
 * Prints the calendars of all the years in the 20th century.Also prints the
 * number of Sundays that occured on the first day of the month during this
 * period.
 */
public class Calender {
    // Starting the calendar on 1/1/1900
    static int curMonth;
    static int curDay;
    static int curYear;
    static int endYear;
    static int curDayOfWeek; // ==> (2) 1.1.1900 was a Monday
    static int nDaysInMonth; // num of days at curr month
    static boolean isLeapYear; // true if year is a leap year
    static int nDays; // number of days in the month
    static int countSunday;

    public static void main(String args[]) {
        advance();
    }

    /**
     * This founction print the calender from 1990 - 1999 inclusive.
     */
    public static void advance() {
        curYear = 1900;
        endYear = 1999;
        curDayOfWeek = 2;
        countSunday = 0;
        while (curYear <= endYear) {
            curMonth = 1;
            while (curMonth <= 12) {
                curDay = 1;
                while (curDay <= nDaysInMonth(curMonth, curYear)) {
                    if (curDayOfWeek <= 7) {
                        System.out.print(curDay + "/" + curMonth + "/" + curYear);
                        if ((curDay == 1) && (curDayOfWeek) == 1) {
                            System.out.print(" Sunday");
                            countSunday++;
                            curDay++;
                            curDayOfWeek++;
                        } else {
                            curDay++;
                            curDayOfWeek++;
                        }
                        if (curDayOfWeek > 7) {
                            curDayOfWeek = 1;
                        }
                    }
                    System.out.println();
                }
                curMonth++;
            }
            curYear++;
        }
        System.out.println("During the 20th century, " + countSunday + " Sundays fell on the first day of the month");
    }

    /**
     * This founction return if the year us leap or common.
     * 
     * @param year - represents the year
     * @return - true if the given year is a leap year, false otherwise.
     */
    private static boolean isLeapYear(int year) {
        // check if the year is divisble by 400
        isLeapYear = ((year % 400) == 0);
        // than checks if the year is divisible by 4 and not by 100
        isLeapYear = isLeapYear || ((year % 4) == 0 && (year % 100) != 0);
        return isLeapYear;
    }

    /**
     * Returns the number of days in the given month and year. April, June,
     * 
     * @param month - represents the month
     * @param year  - represents the year
     * @return - the number of days in the given month and year
     */
    private static int nDaysInMonth(int curMonth, int curYear) {
        switch (curMonth) {
            case 1, 3, 5, 7, 8, 10, 12: // January, March, May, July, August, October, and December
                nDays = 31;
                break;
            case 2: // February
                nDays = isLeapYear(curYear) ? 29 : 28;
                break;
            case 4, 6, 9, 11: // April, June, September, and November
                nDays = 30;
                break;
            default:
                nDays = 0;
                System.out.println("Invalid month");
                break;
        }
        return nDays;
    }
}
