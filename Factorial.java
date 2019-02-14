public class Factorial {
	
	public static int factorial(int n){
		int total;
		if (n == 0){
			total = 1;
		} else {
			total = n * factorial(n-1);
		}

		return total;
	}

	public static void main(String[] args) {
		System.out.println("factorial(1): " + factorial(1));
		System.out.println("factorial(2): " + factorial(2));
		System.out.println("factorial(3): " + factorial(3));
		System.out.println("factorial(4): " + factorial(4));
		System.out.println("factorial(5): " + factorial(5));
		System.out.println("factorial(6): " + factorial(6));
		System.out.println("factorial(7): " + factorial(7));
		System.out.println("factorial(8): " + factorial(8));
		System.out.println("factorial(12): " + factorial(12));
	}
}