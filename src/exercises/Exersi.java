package exercises;

public class Exersi {
	public static void main(String[] args) {

		String[] b = { "sunday", "monday", "tuesday" };

		for (int i = 0; i < b.length; i++) {

			b[i] = b[i].charAt(0) + b[i].substring(1, 2).toUpperCase() + b[i].substring(2, b[i].length());

			System.out.println(b[i]);
		}


	}

}
