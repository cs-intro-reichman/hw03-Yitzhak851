public class LoanCalc {
	// declare some few class static variables
	static double epsilon = 0.001; // The computation tolerance (estimation error)
	static int stepCounter; // Monitors the efficiency of the calculation
	static int n; // number of periods
	static double loan; // sum of the loan
	static double rate;  // periodical interest rate (as a percentage)
	static double payment; // periodical payment

	/**
	 * Uses a sequential search method ("brute force") to compute an approximation
	 * of the periodical payment that will bring the ending balance 
	 * of a loan close to 0.
	 * Given: the sum of the loan (loan), the periodical interest rate (rate),
	 * the number of periods (n), and epsilon (epsilon), a tolerance level.
	 */
	// Side effect: modifies the class variable iterationCounter.
	public static double bruteForceSolver(double loan, double rate, int n, double epsilon) {
		while (Math.abs(n) > epsilon)) {
			
		}
		return 0;
	}

	/**
	 * Uses bisection search to compute an approximation of the periodical payment
	 * that will bring the ending balance of a loan close to 0.
	 * Given: the sum of theloan, the periodical interest rate (as a percentage),
	 * the number of periods (n), and epsilon, a tolerance level.
	 */
	// Side effect: modifies the class variable iterationCounter.
	public static double bisectionSolver(double loan, double rate, int n, double epsilon) {
		// Replace the following statement with your code
		return 0;
	}

	/**
	 * Computes the ending balance of a loan, given the sum of the loan, the
	 * periodical
	 * interest rate (as a percentage), the number of periods (n), and the
	 * periodical payment.
	 */
	private static double endBalance(double loan, double rate, int n, double payment) {
		System.out.println("Period " + 0 + " = " + loan);
		// temp = ending balance
		double temp = loan;
		for (int i = 1; i <= n; i++) {
			temp = (temp - periodPayment) * (1 + rate / 100);
			System.out.println("Period " + i + " = " + temp);
		}
		return periodPayment;
	}

	/**
	 * Gets the loan data and computes the periodical payment.
	 * Expects to get three command-line arguments: sum of the loan (double),
	 * interest rate (double, as a percentage), and number of payments (int).
	 */
	public static void main(String[] args) {
		// Gets the loan data
		loan = Double.parseDouble(args[0]);
		rate = Double.parseDouble(args[1]);
		n = Integer.parseInt(args[2]);
		payment = 10000;
		// Prints the loan data
		System.out.println("Loan sum = " + loan + ", interest rate = " + rate + "%, periods = " + n);
		endBalance(loan, rate, n, payment);
		
		// Computes the periodical payment using brute force search
		System.out.print("Periodical payment, using brute force: ");
		System.out.printf("%.2f", bruteForceSolver(loan, rate, n, epsilon));
		System.out.println();
		System.out.println("number of iterations: " + stepCounter);

		// Computes the periodical payment using bisection search
		System.out.print("Periodical payment, using bi-section search: ");
		System.out.printf("%.2f", bisectionSolver(loan, rate, n, epsilon));
		System.out.println();
		System.out.println("number of iterations: " + stepCounter);
	}
}