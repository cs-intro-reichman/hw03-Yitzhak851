
public class Calender {
    // Starting the calendar on 1/1/1900
    static int curMonth;
    static int curDay;
    static int startYear;
    static int curYear;
    static int endYear;
    static int curDayOfWeek; // ==> (2) 1.1.1900 was a Monday
    static int nDaysInMonth; // num of days at curr month
    static boolean isLeapYear; // true if year is a leap year
    static int nDays; // number of days in the month

    public static void main(String args[]) {
        startYear = 1990;
        curYear = Integer.parseInt(args[0]);
        endYear = curYear + 1;
        advance();
    }

    /**
     * This founction print the calender from 1990 - 1999 inclusive.
     */
    public static void advance() {
        curDayOfWeek = 2;
        while (startYear < endYear) {
            curMonth = 1;
            while (curMonth <= 12) {
                curDay = 1;
                while (curDay <= nDaysInMonth(curMonth, startYear)) {
                    if (startYear == curYear) {
                        if (curDayOfWeek <= 7) {
                            System.out.print(curDay + "/" + curMonth + "/" + startYear);
                            if (curDayOfWeek == 1) {
                                System.out.print(" Sunday");
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
                    } else {
                        if (curDayOfWeek <= 7) {
                            if ((curDay == 1) && (curDayOfWeek) == 1) {
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
                    }
                }
                curMonth++;
            }
            startYear++;
        }
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
    private static int nDaysInMonth(int curMonth, int startYear) {
        switch (curMonth) {
            case 1, 3, 5, 7, 8, 10, 12: // January, March, May, July, August, October, and December
                nDays = 31;
                break;
            case 2: // February
                nDays = isLeapYear(startYear) ? 29 : 28;
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
