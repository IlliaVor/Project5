package Part2Decomposition;

import java.util.Scanner;

/**
 * Start
 * Create a scanner object
 * Initialize continueConversation to true
 * While continueConversation is true
 * Greet the user
 * Get the user's name
 * Get the user's age
 * Get the user's favorite book genre
 * Recommend a book to the user
 * Prompt the user to continue
 * End while
 * Say goodbye
 * End
 */
public class Part2decomposition {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continueConversation = true;
        String mood, name, genre, recommendation;
        int age = in.nextInt();

        while (continueConversation) {
            mood = greetUser(in);
            name = getUserName(in);
            age = getUserAge(in);
            genre = getUserGenre(in);
            recommendation = recommendBook(age, genre);
            continueConversation = continueConversation(in);
        }

        System.out.println("Goodbye!");
        in.close();
    }


    public static String greetUser(Scanner in) {
        System.out.println("Hey, how's it going?");
        String mood = in.nextLine();
        return mood;
    }

    public static String getUserName(Scanner in) {
        System.out.print("May I know your name? ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }


    public static int getUserAge(Scanner in) {
        System.out.print("How old are you? ");
        int age = in.nextInt();
        in.nextLine();
        return age;
    }

    public static String getUserGenre(Scanner in) {
        System.out.print("What is your favorite book genre? ");
        String genre = in.nextLine();
        return genre;
    }

    public static String recommendBook(int age, String genre) {
        String recommendation;

        if (age >= 13 && age <= 16) {
            recommendation = "Stuart Turton: 'The Seven Deaths of Evelina Hardcastle'.";
        } else if (age >= 17 && age <= 25) {
            recommendation = "'The Right Stuff' by Tom Wolf.";
        } else if (age >= 18 && age <= 35) {
            recommendation = "'Harry Potter and the Sorcerer's Stone' by J.K. Rowling.";
        } else if (age >= 30 && age <= 45) {
            recommendation = "'Gone Girl' by Gillian Flynn.";
        } else if (age >= 40 && age <= 60) {
            recommendation = "'Dune' by Frank Herbert.";
        } else if (age >= 60) {
            recommendation = "'Mind Games' by Sylvia Nazar.";
        } else {
            System.out.println("I'm sorry, I don't have a specific recommendation for your input.");
            return null;
        }

        System.out.println(genre + "." + " Okay. I can also recommend you:");
        System.out.println(recommendation);
        return recommendation;
    }

    public static boolean continueConversation(Scanner in) {
        System.out.print("Do you want to continue? (Y/N): ");
        String continueInput = in.nextLine();

        return continueInput.equalsIgnoreCase("Y");
    }
}



