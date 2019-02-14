public class BunnyEars {
	
	public static int bunnyEars(int bunnies){

		int total;
		if (bunnies > 0){
			total = 2 + bunnyEars(bunnies -1);
		} else {
			total = 0;
		}

		return total;
	}

	public static void main(String[] args) {
		System.out.println("bunnyEars(0): " + bunnyEars(0));
		System.out.println("bunnyEars(1): " + bunnyEars(1));
		System.out.println("bunnyEars(2): " + bunnyEars(2));
		System.out.println("bunnyEars(3): " + bunnyEars(3));
		System.out.println("bunnyEars(4): " + bunnyEars(4));
		System.out.println("bunnyEars(5): " + bunnyEars(5));
		System.out.println("bunnyEars(12): " + bunnyEars(12));
		System.out.println("bunnyEars(50): " + bunnyEars(50));
		System.out.println("bunnyEars(234): " + bunnyEars(234));
	}
}