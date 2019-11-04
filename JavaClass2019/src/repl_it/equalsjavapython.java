package repl_it;

import java.util.Scanner;

public class equalsjavapython {
	/*
	 * Given a string, print out true if the number of appearances of "java"
	 * anywhere in the string is equal to the number of appearances of "python"
	 * anywhere in the string (case sensitive). Example: input: We study java not
	 * python output: true
	 * 
	 * Example: input: What's the difference between java, javascript and python?
	 * output: false
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String sentence = scan.nextLine();
		int countj = 0;
		int countp = 0;

		while (sentence.contains("java")) {
			sentence.replaceFirst("java", "");
			countj += 1;
		}
		while (sentence.contains("python")) {
			sentence.replaceFirst("python", "");
			countp += 1;

		}

		if (countj == countp) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
