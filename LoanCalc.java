public class LoanCalc {
// test
	// declare some few class static variables
	static double epsilon; // The computation tolerance (estimation error)
	static int iterationCounter; // Monitors the efficiency of the calculation
	static int n; // number of periods
	static double g; // periodical payment
	static double loan; // sum of the loan
	static double rate; // periodical interest rate (as a percentage)
	static double payment; // periodical payment
	static double endBalance; // ending balance of the loan
	static double low; // lower bound of the periodical payment
	static double high; // upper bound of the periodical payment

	/**
	 * Uses a sequential search method ("brute force") to compute an approximation
	 * of the periodical payment that will bring the ending balance
	 * of a loan close to 0.
	 * Given: the sum of the loan (loan), the periodical interest rate (rate),
	 * the number of periods (n), and epsilon (epsilon), a tolerance level.
	 */
	// Side effect: modifies the class variable iterationCounter.
	public static double bruteForceSolver(double loan, double rate, int n, double epsilon) {
		g = loan / n;
		iterationCounter = 0;
		while (endBalance(loan, rate, n, g) > epsilon) {
			g += epsilon;
			iterationCounter++;
		}
		return g;
	}

	/**
	 * Uses bisection search to compute an approximation of the periodical payment
	 * that will bring the ending balance of a loan close to 0.
	 * Given: the sum of theloan, the periodical interest rate (as a percentage),
	 * the number of periods (n), and epsilon, a tolerance level.
	 */
	// Side effect: modifies the class variable iterationCounter.
	public static double bisectionSolver(double loan, double rate, int n, double epsilon) {
		// initialize the variables
		iterationCounter = 0;
		low = loan / n;
		high = loan;
		g = (low + high) / 2;
		// logic of the bisection search
		while ((high - low) > epsilon) {
			if (endBalance(loan, rate, n, g) * endBalance(loan, rate, n, low) > 0) {
				low = g;
			} else {
				high = g;
			}
			g = (low + high) / 2;
			iterationCounter++;
		}
		return g;
	}

	/**
	 * Computes the ending balance of a loan,
	 * given:
	 * 1.the sum of the loan (loan).
	 * 2.the periodical interest rate as a percentage (rate).
	 * 3.the number of periods (n).
	 * 4.the periodical payment (payment).
	 * 
	 * @return - the ending balance of the loan.
	 */
	private static double endBalance(double loan, double rate, int n, double payment) {
		endBalance = loan;
		for (int i = 0; i < n; i++) {
			endBalance = (endBalance - payment) * (1 + rate / 100);
		}
		return endBalance;
	}

	/**
	 * Gets the "loan data" and computes the periodical payment.
	 * Expects to get three command-line arguments:
	 * 1.sum of the loan (double).
	 * 2.interest rate as a percentage(double).
	 * 3.number of payments (int).
	 */
	public static void main(String[] args) {
		// Gets the loan data
		loan = Double.parseDouble(args[0]); // 100,000
		rate = Double.parseDouble(args[1]); // 5.0
		n = Integer.parseInt(args[2]); // 10

		epsilon = 0.001;
		payment = 10000;
		// Prints the loan data
		System.out.println("Loan sum = " + loan + ", interest rate = " + rate + "%, periods = " + n);

		// Computes the periodical payment using brute force search
		System.out.print("Periodical payment, using brute force: ");
		System.out.printf("%.2f", bruteForceSolver(loan, rate, n, epsilon));
		System.out.println();
		System.out.println("number of iterations: " + iterationCounter);

		// Computes the periodical payment using bisection search
		System.out.print("Periodical payment, using bi-section search: ");
		System.out.printf("%.2f", bisectionSolver(loan, rate, n, epsilon));
		System.out.println();
		System.out.println("number of iterations: " + iterationCounter);
	}
}