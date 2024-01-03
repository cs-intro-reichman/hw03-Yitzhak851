public class Calendar0 {
	static int year; // year for which we want to construct a calendar
	static boolean isLeapYear; // true if year is a leap year
	static int nDays; // number of days in the month
	public static void main(String args[]) {
		year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}

	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		for (int month = 1; month <= 12; month++) {
			System.out.println("Month " + month + " has " + nDaysInMonth(month, year) + " days");
		}
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		// check if the year is divisble by 400
		isLeapYear = ((year % 400) == 0);
		// than checks if the year is divisible by 4 and not by 100
		isLeapYear = isLeapYear || ((year % 4) == 0 && (year % 100) != 0);
		return isLeapYear;
	}

	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 : // January, March, May, July, August, October, and December
				nDays = 31;
				break;
			case 2: // February
				nDays = isLeapYear(year) ? 29 : 28;
				break;
			case 4, 6 , 9 , 11 : // April, June, September, and November
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
