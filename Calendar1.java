public class Calendar1 {
	// Starting the calendar on 1/1/1900
	static int dayOfMonth = 1; // 1st of the month
	static int month = 1; // January
	static int year = 1900; // year for which we want to construct a calendar
	static int dayOfWeek = 2; // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int debugDaysCounter;
	static int debugMonthCounter;
	static boolean isLeapYear; // true if year is a leap year
	static int nDays; // number of days in the month
	// 31.12.1999 inclusive

	public static void main(String args[]) {
		printCalendar();
	}

	public static void printCalendar() {

		// year = 1900;
		while (year <= 1999) {
			debugDaysCounter = nDaysInMonth(month, year); // debugDaysCounter= 31
			debugMonthCounter = 12;
			while (debugDaysCounter >= dayOfMonth) {
				System.out.println(dayOfMonth + "/" + month + "/" + year);
				debugDaysCounter--;
			}
			while (month <= debugMonthCounter) {
				month++;
				debugDaysCounter = nDaysInMonth(month, year); // debugDaysCounter= 31
			}

			// isLeapYear(year);
			// nDaysInMonth(month, year);
			// printCalendar();
					//// Write the body of the while
			// advance();

			//// If you want to stop the loop after n days, replace the condition of the
			//// if statement with the condition (debugDaysCounter == n)
			if (false) {
				break;
			}
			year++; // advance to the next year
		}
	}
	// 1/1/1900
	// 2/1/1900
	// 3/1/1900
	// 4/1/1900
	// 5/1/1900
	// 6/1/1900
	// 7/1/1900 Sunday

	// Advances the date (day, month, year) and the day-of-the-week.
	// If the month changes, sets the number of days in this month.
	// Side effects: changes the static variables dayOfMonth, month, year,
	// dayOfWeek, nDaysInMonth.
	private static void advance() {
		for (month = 1; month <= 12; month++) {
			nDaysInMonth(month, year);
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
	private static int nDaysInMonth(int month, int year) {
		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12: // January, March, May, July, August, October, and December
				nDays = 31;
				break;
			case 2: // February
				nDays = isLeapYear(year) ? 29 : 28;
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
