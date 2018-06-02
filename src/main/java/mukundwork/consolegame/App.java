package mukundwork.consolegame;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		
		System.out.println("**Welcome to the console Game!");
		System.out.println("  Use Q to Quit");

		Scanner in = new Scanner(System.in);
		while (true) {

			System.out.println("Enter a string");
			String inputString = in.nextLine();

			if ("Q".equalsIgnoreCase(inputString)) {
				break;
			}

			processInput(inputString);

		}
		System.out.println("  Exiting Game");
		
	}

	private static void processInput(String inputString) {
		System.out.println("echo: " + inputString);

	}
}
