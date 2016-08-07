//BLAIR AND KRISTEN'S AWESOME PROJECT

import java.util.ArrayList;
import java.util.Scanner;

public class Lab10_MAIN {
	public static void main(String[] args) {

		String choice = ("y");
		System.out.println("Welcome to the Movie List Application.  \nThere are 100 movies in this list.");

		while (choice.equalsIgnoreCase("y")) {
			ArrayList<Movie> list = new ArrayList<Movie>();
			list.add(new Movie("Star Wars", "scifi")); // Movie 1
			list.add(new Movie("Dumbo", "animated")); // Movie 2
			list.add(new Movie("101 Dalmations", "animated")); // Movie 3
			list.add(new Movie("Chucky", "horror")); // Movie 4
			list.add(new Movie("Bambi", "animated")); // Movie 5
			list.add(new Movie("Forrest Gump", "drama")); // Movie 6
			list.add(new Movie("The 6th Sense", "horror")); // Movie 7
			list.add(new Movie("Rocky", "drama")); // Movie 8
			list.add(new Movie("Divergent", "scifi")); // Movie 9
			list.add(new Movie("The Matrix", "scifi")); // Movie 10

			System.out.println("What category are you interested in? (scifi, animated, drama, or horror)");
			Scanner scan1 = new Scanner(System.in);
			String userInput = "";

			userInput = scan1.nextLine();

			while (!userInput.equalsIgnoreCase("scifi") && !userInput.equalsIgnoreCase("drama")
					&& !userInput.equalsIgnoreCase("animated") && !userInput.equalsIgnoreCase("horror")) {
				System.out.println("Please enter one of the 4 categories given.");
				userInput = scan1.nextLine();
			}

			for (int i = 0; i < list.size(); i++) {
				if (userInput.equalsIgnoreCase(list.get(i).getCategory())) {

					System.out.println(list.get(i).getTitle());
				}
			}

			System.out.println("\nContinue? (y/n)");
			choice = scan1.nextLine();
		}
		System.out.println("Goodbye.");
	}
	
}
