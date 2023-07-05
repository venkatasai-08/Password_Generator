/**
 * Password - A Java program to generate a random password and construct an email using the password.
 * The password consists of characters from predefined character sets: numbers, letters (both uppercase and lowercase), and symbols.
 * The program prompts the user to enter an email ID and the desired length of the password.
 * It generates the password and constructs an email address using the provided information.
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class Password {
    // Predefined character sets for password generation
    private static final String NUMBERS = "0123456789";
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String SYMBOLS = "<.>!@#$%^&*()?/*-/+";

    /**
     * Generates a random password of the specified length.
     *
     * @param length The desired length of the password.
     * @return The generated random password as a string.
     */
    private static String generatePassword(int length) {
        String characters = CHARACTERS + NUMBERS + SYMBOLS;
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }

    
    private static String generateEmail(String user, String password) {
        String domain = "@gmail.com"; // Change the domain as needed
        return user + domain;
    }

    /**
     * The main method, entry point of the program.
     * Prompts the user to enter an email ID and the desired password length.
     * Generates a random password and constructs an email address using the user ID and password.
     * Finally, displays the generated password and email address on the console.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the email ID:");
        String user = scanner.nextLine();
        System.out.println("Enter the length of the password:");
        int length = scanner.nextInt();

        // Validate user input
        if (user.isEmpty() || length <= 0) {
            System.out.println("Invalid input. Please provide a valid username and password length.");
            return;
        }

        // Generate password and email
        String password = generatePassword(length);
        String email = generateEmail(user, password);

        // Display the results
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
    }
}
